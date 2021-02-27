package pattern.create.factory.factory_method.factory;

import pattern.create.factory.factory_method.coffee.Coffee;

// 抽象工厂
public interface CoffeeFactory {

    //创建咖啡对象的方法
    Coffee createCoffee();
}
