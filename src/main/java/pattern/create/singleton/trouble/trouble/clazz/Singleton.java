package pattern.create.singleton.trouble.trouble.clazz;

public class Singleton {

    //私有构造方法
    private Singleton() {}
    
    private static volatile Singleton instance;

    //对外提供静态方法获取该对象
    public static Singleton getInstance() {

        if(instance != null) {
            return instance;
        }

        synchronized (Singleton.class) {
            if(instance != null) {
                return instance;
            }
            instance = new Singleton();
            return instance;
        }
    }
}