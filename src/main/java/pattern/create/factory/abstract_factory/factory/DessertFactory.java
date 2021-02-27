package pattern.create.factory.abstract_factory.factory;

import pattern.create.factory.abstract_factory.coffee.Coffee;
import pattern.create.factory.abstract_factory.dessert.Dessert;

// 甜品工厂
public interface DessertFactory {

    //生产咖啡的功能
    Coffee createCoffee();

    //生产甜品的功能
    Dessert createDessert();
}
