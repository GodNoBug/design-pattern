package pattern.create.factory.simple_factory;

import pattern.create.factory.simple_factory.coffee.Coffee;

// 对象的创建过程和使用过程的解耦
public class Client {
    public static void main(String[] args) {
        //创建咖啡店类对象
        CoffeeStore store = new CoffeeStore();
        Coffee coffee = store.orderCoffee("latte");

        System.out.println(coffee.getName());
    }
}
