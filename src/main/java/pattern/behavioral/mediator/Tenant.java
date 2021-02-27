package pattern.behavioral.mediator;

import pattern.behavioral.mediator.mediator.Mediator;

// 具体的同事类
public class Tenant extends Person {
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }

    // 和中介联系沟通的方法
    public void contact(String message) {
        mediator.contact(message, this);
    }

    // 获取消息的方法
    public void getMessage(String message) {
        System.out.println("租房者" + name + "获取到的信息是：" + message);
    }
}
