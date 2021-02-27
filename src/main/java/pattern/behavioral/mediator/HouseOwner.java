package pattern.behavioral.mediator;

import pattern.behavioral.mediator.mediator.Mediator;

// 房东
public class HouseOwner extends Person{

    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    // 和中介联系沟通的方法
    public void contact(String message) {
        mediator.contact(message, this);
    }

    public void getMessage(String message){
        System.out.println("房主" + name + "获取到的信息是：" + message);
    }

}
