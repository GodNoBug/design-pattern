package pattern.create.factory.factory_method.factory;

import pattern.create.factory.factory_method.coffee.Coffee;
import pattern.create.factory.factory_method.coffee.LatteCoffee;

// 具体工厂：拿铁咖啡工厂，专门用来生产拿铁咖啡
public class LatteCoffeeFactory implements CoffeeFactory {

    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
