package pattern.create.factory.abstract_factory.factory;

import pattern.create.factory.abstract_factory.coffee.AmericanCoffee;
import pattern.create.factory.abstract_factory.coffee.Coffee;
import pattern.create.factory.abstract_factory.dessert.Dessert;
import pattern.create.factory.abstract_factory.dessert.MatchaMousse;

// 美式风味的甜品工厂
//  生产 美式咖啡和抹茶慕斯 为一个产品族
public class AmericanDessertFactory implements DessertFactory {

    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
