package pattern.behavioral.mediator;

import pattern.behavioral.mediator.mediator.Mediator;

// 抽象同事类
public abstract class Person {
    protected String name;
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
