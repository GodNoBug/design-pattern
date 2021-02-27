package pattern.create.factory.simple_factory;

import pattern.create.factory.simple_factory.coffee.AmericanCoffee;
import pattern.create.factory.simple_factory.coffee.Coffee;
import pattern.create.factory.simple_factory.coffee.LatteCoffee;

// 简单咖啡工厂类，用来生产咖啡 - 具体工厂
public class SimpleCoffeeFactory {

    public /*static*/ Coffee createCoffee(String type) {
        //声明Coffee类型的变量，根据不同类型创建不同的coffee子类对象
        Coffee coffee = null;
        if("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您所点的咖啡没有");
        }
        // 后期如果再加新品种的咖啡,我们势必需要修改此类代码,违反了开闭原则
        // 但是如果只需要修改工厂类的代码,省去其他修改的操作
        return coffee;
    }
}
