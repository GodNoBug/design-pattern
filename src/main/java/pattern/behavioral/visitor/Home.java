package pattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

// 结构对象角色
public class Home {
    // 声明一个集合对象,用来存储元素对象q
    private List<Animal> nodeList = new ArrayList<>();

    // 接收访问者访问
    public void action(Person person) {
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }

    // 添加元素功能
    public void add(Animal animal) {
        nodeList.add(animal);
    }
}
