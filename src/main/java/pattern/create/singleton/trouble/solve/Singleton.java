package pattern.create.singleton.trouble.solve;

import java.io.Serializable;

// 在Singleton类中添加`readResolve()`方法，在反序列化时被反射调用，
// 如果定义了这个方法，就返回这个方法的值，如果没有定义，则返回新new出来的对象。
public class Singleton implements Serializable {

    //私有构造方法
    private Singleton() {}

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    //对外提供静态方法获取该对象
    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }
    
    /**
     * 下面是为了解决序列化反序列化破解单例模式
     */
    private Object readResolve() {
        return SingletonHolder.INSTANCE;
    }
}