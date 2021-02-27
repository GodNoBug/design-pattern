package pattern.create.singleton.runtime;

public class Client {
    public static void main(String[] args) {
        // JDK中Runtime源码使用的是饿汉式静态属性方式的单例
        System.out.println(Runtime.getRuntime()==Runtime.getRuntime());
    }
}
