package pattern.create.singleton.lazy.demo2;

/**
 * 懒汉式,线程安全式 方法级别锁
 *  说明：
 *      从上面代码我们可以看出该方式在成员位置声明Singleton类型的静态变量，并没有进行对象的赋值操作，
 *      那么什么时候赋值的呢？当调用getInstance()方法获取Singleton类的对象的时候才创建Singleton类的对象，这样就实现了懒加载的效果。
 *      但是，如果是多线程环境，会出现线程安全问题。
 */
public class Singleton {
    // 私有化构造方法
    private Singleton() {
    }

    // 声明Singleton类型的变量instance,但是不会赋值
    private static Singleton instance;

    // 对外提供访问方式

    public synchronized static Singleton getInstance() {
        if (instance == null) {
            // 假设线程1进入判断还没new就进入等待,CPU执行权现在被2拿走了,线程2进入判断new了,然后切换到线程1然后new,最终单例失效了。
            instance = new Singleton();
        }
        return instance;
    }
    // 没有必要让每个线程必须持有锁才能调用该方法,大部分操作都是读操作,读操作是线程安全的
}
