package pattern.create.factory.abstract_factory.factory;

import pattern.create.factory.abstract_factory.coffee.Coffee;
import pattern.create.factory.abstract_factory.coffee.LatteCoffee;
import pattern.create.factory.abstract_factory.dessert.Dessert;
import pattern.create.factory.abstract_factory.dessert.Trimisu;

//意大利风味甜品工厂 生产拿铁咖啡和提拉米苏甜品 为一个产品族
public class ItalyDessertFactory implements DessertFactory {

    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    public Dessert createDessert() {
        return new Trimisu();
    }
}
