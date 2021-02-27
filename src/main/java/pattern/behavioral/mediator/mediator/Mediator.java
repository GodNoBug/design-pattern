package pattern.behavioral.mediator.mediator;

import pattern.behavioral.mediator.Person;

// 抽象中介者类
public abstract class Mediator {
   public abstract void contact(String message, Person person);
}
