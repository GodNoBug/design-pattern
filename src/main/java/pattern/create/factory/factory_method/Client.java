package pattern.create.factory.factory_method;

import pattern.create.factory.factory_method.coffee.Coffee;
import pattern.create.factory.factory_method.factory.CoffeeFactory;
import pattern.create.factory.factory_method.factory.LatteCoffeeFactory;

// 客户端
public class Client {
    public static void main(String[] args) {
        //创建咖啡店对象
        CoffeeStore store = new CoffeeStore();
        //创建对象
        //CoffeeFactory factory = new AmericanCoffeeFactory();
        CoffeeFactory factory = new LatteCoffeeFactory();
        store.setFactory(factory);

        //点咖啡
        Coffee coffee = store.orderCoffee();
        System.out.println(coffee.getName());
    }
}
