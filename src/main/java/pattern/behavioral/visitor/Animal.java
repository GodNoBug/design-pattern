package pattern.behavioral.visitor;

public interface Animal {
    // 接收访问者访问的功能
    void accept(Person person);
}
