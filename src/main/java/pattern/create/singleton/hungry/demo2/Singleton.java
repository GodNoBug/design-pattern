package pattern.create.singleton.hungry.demo2;
//

/**
 * 饿汉式：静态代码块
 * 说明：
 *      该方式在成员位置声明Singleton类型的静态变量，而对象的创建是在静态代码块中，也是对着类的加载而创建。
 *    所以和饿汉式的方式1基本上一样，当然该方式也存在内存浪费问题。
 */
public class Singleton {
    // 私有构造方法
    private Singleton() {
    }
    // 只声明该类的成员变量,不赋值
    private static Singleton instance; // null
    // 在静态代码块中进行赋值
    static {
        instance=new Singleton();
    }
    // 对外提供获取该类对象的方法
    public static Singleton getInstance(){
        return instance;
    }

}

