package pattern.create.singleton.hungry.demo1;

/**
 * 饿汉式 静态成员变量的方式(饿汉式是天然线程安全的)
 * 单例类
 * 说明:
 * 	    该方式在成员位置声明Singleton类型的静态变量，并创建Singleton类的对象instance。instance对象是随着类的加载而创建的。
 * 	 如果该对象足够大的话，而一直没有使用就会造成内存的浪费。
 */
public class Singleton {
    // 1.私有构造方法
    private Singleton() {
    }
    // 2.在本类中创建该类的对象,供外界使用
    private static Singleton instance =new Singleton();
    // 3.提供一个公共的访问方式,让外界获取该对象 外界无法创建Singleton对象,无法调用非静态的方法和非静态变量
    public static Singleton getInstance() {
        return instance;
    }
}
