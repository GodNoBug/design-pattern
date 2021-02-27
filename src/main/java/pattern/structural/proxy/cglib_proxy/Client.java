package pattern.structural.proxy.cglib_proxy;

public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory=new ProxyFactory();
        TrainStation proxyObject = proxyFactory.getProxyObject();
        proxyObject.sell();
        proxyObject.refund();
    }
}
