package pattern.create.singleton.trouble.solve;

// 反射方式破解单例的解决方法
// 这种方式比较好理解。当通过反射方式调用构造方法进行创建创建时，直接抛异常。不运行此中操作。
public class Singleton2 {

    //私有构造方法
    private Singleton2() {
        /*
           反射破解单例模式需要添加的代码
        */
        if(instance != null) {
            throw new RuntimeException();
        }
    }
    
    private static volatile Singleton2 instance;

    //对外提供静态方法获取该对象
    public static Singleton2 getInstance() {

        if(instance != null) {
            return instance;
        }

        synchronized (Singleton.class) {
            if(instance != null) {
                return instance;
            }
            instance = new Singleton2();
            return instance;
        }
    }
}