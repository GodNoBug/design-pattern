package pattern.create.factory.factory_method.factory;

import pattern.create.factory.factory_method.coffee.AmericanCoffee;
import pattern.create.factory.factory_method.coffee.Coffee;

// 具体工厂: 美式咖啡工厂对象，专门用来生产美式咖啡
public class AmericanCoffeeFactory implements CoffeeFactory {

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
