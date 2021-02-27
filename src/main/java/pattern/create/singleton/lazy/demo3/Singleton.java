package pattern.create.singleton.lazy.demo3;
// 双重检查锁方式
public class Singleton {
    // 私有构造方法
    private Singleton() {
    }
    // 声明Singleton类型的变量 此处volatile 为了防止指令重排序
    private static volatile Singleton instance;

    // 对外提供公共的访问方式
    public static Singleton getInstance() {
        // 第一次判断,如果instance的值不为空,是读操作,不需要抢占锁,直接返回对象
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance=new Singleton();
                }
            }

        }
        return instance;
    }
}
// 为何要两次判空

// 1.外层判空的作用: 如果直接判为非空,不进入抢锁阶段,直接返回(读操作直接返回,不走同步代码块),若判断空,则走创建动作(写操作走同步代码块)
// 2.内层判空的作用: 防止其他线程重复创建对象

// 线程A 进入getInstance方法
//    第一次判断instance为null,线程A 进入synchronized块.

// 现在CPU执行权被线程B占用
// 线程B 进入getInstance方法
//    第一次判断instance为null,线程B试图获取进入synchronized块的锁,然而由于线程A已经持有该锁,线程B在此阻塞

// 现在CPU执行权被线程A占用
//    若此处没有判断,线程A将创建一个Singleton对象并将引用赋值给instance.CPU执行权轮到线程B仍然会执行一遍
//    若此处有判断,线程A将创建一个Singleton对象并将引用赋值给instance.CPU执行权轮到线程B将会判空,若已经创建成功则直接返回


// volatile: 防止创建对象的复合操作指令重排,导致新线程在外层if判断为非空返回错误的(未初始化完全的)对象
//
//    instance=new Singleton(); 是复合操作
//          1.在堆中分配对象内存
//          2.填充对象必要信息+具体数据初始化+末位填充
//          3.将引用指向这个对象的堆内地址
//  那么，在完成1后，对象的大小和地址已经确定，因此，2和3其实存在指令重排序的可能。
//  并且可以看到，3的操作明显比2要少，那么如果让2与3一起执行，并且反应到具体的顺序上变成了1-3-2.
//  先完成3，引用变量instance先指向了在堆中给对象分配的空间，然后2仍在慢慢吞吞继续。
//  这时候，被synchronized挡在外面的阻塞线程其实是不会有什么影响的，因为一定会等到对象创建完，首个拿锁者才会释放锁。
//  那么关键是在，此刻如果在3完成而2未完成这个临界点，有一个新线程调用getInstance()，那么第一个if，会怎么样？
//  答案是因为第一个if没在同步块里，而此时instance已经非空，指向具体内存地址了，所以直接返回此时未完成初始化的instance实例
//  那么如果在Singleton里有个变量int number ,有个方法int getNumber()返回number，这时候调用
//  Singleton.getInstance().getNumber();
//  会怎样？不知道，可能会报错，或者会得到错误结果，但这就是我能想到的volatile避免的情况了。
//  volatile修饰变量避免指令重排序，保证1-2-3按顺序来，这样即使在首个拿锁者未释放锁前，有线程切入，当它在第一个if处得到instance非空时，此时instance的初始化也一定已经完成。
//  因此这就是volatile在DCL的作用了