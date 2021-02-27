package pattern.structural.proxy.cglib_proxy;


import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

// 获取代理对象的工厂类,
public class ProxyFactory implements MethodInterceptor{

    // 声明目标对象
    private TrainStation station = new TrainStation();

    // 获取代理对象的方法
    public TrainStation getProxyObject() {
        // 创建Enhancer对象,类似于JDK代理中的Proxy类
        Enhancer enhancer = new Enhancer();
        // 设置父类的字节码对象
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数
        enhancer.setCallback(this);
        // 创建代理对象
        return (TrainStation) enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("代售点收取一定的服务费用(CGLIB)");
        return method.invoke(station, objects);
    }
}
