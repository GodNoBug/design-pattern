package pattern.structural.proxy.jdk_proxy;

public class Client {
    public static void main(String[] args) {
        // 获取代理对象
        // 1.创建代理工厂对象
        ProxyFactory proxyFactory=new ProxyFactory();
        // 2.使用factory对象的方法获取代理对象
        SellTickets proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();

        // class com.sun.proxy.$Proxy0
        // java -jar arthas-boot.jar
        // jad com.sun.proxy.$Proxy0
        // 查看内存中的代理类
        System.out.println(proxyObject.getClass());

        // 让程序一直执行,不让代理类在内存中释放掉
        while (true){}

    }
}
