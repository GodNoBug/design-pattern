package pattern.structural.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

// 获取代理对象的工厂类,
//     此处ProxyFactory并不是代理模式中所说的代理类,而代理类是程序在运行过程中动态的在内存中生成的类.
// 代理类也实现了对应的接口
public class ProxyFactory {

    // 声明目标对象
    private TrainStation station = new TrainStation();

    // 获取代理对象的方法
    public SellTickets getProxyObject() {

        // 返回代理对象即可
        // 参数1 类加载器,用于加载代理类。可以通过目标对象获取类加载器
        // 参数2 接口们,代理类实现的接口的字节码对象
        // 参数3 代理对象的调用处理程序
        return (SellTickets) Proxy.newProxyInstance(station.getClass().getClassLoader(), station.getClass().getInterfaces(),
                new InvocationHandler() {
                    /**
                     *
                     * @param proxy 代理对象,和返回的是同一个对象,在invoke方法中基本不用
                     * @param method 对接口中的方法进行封装的method对象
                     * @param args 调用方法的实际参数
                     * @return 接口方法的返回值(SellTickets)
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        // 增强
                        System.out.println("代售点收取一定的服务费用(JDK动态代理)");
                        // 执行目标对象的方法
                        return method.invoke(station, args);
                    }
                });
    }
}
