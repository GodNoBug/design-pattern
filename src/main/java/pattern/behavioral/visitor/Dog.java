package pattern.behavioral.visitor;

public class Dog implements Animal{
    @Override
    public void accept(Person person) {
        person.feed(this);// 访问者给宠物狗喂食
        System.out.println("好好吃,汪汪汪...");
    }
}
