package pattern.behavioral.visitor;

// 具体元素角色类
public class Cat implements Animal {
    @Override
    public void accept(Person person) {
        person.feed(this); // 访问者给宠物猫喂食
        System.out.println("好好吃,喵喵喵...");
    }
}
