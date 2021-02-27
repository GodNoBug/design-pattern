package pattern.behavioral.visitor;

public class Client {
    public static void main(String[] args) {
        Home home = new Home();
        home.add(new Dog());
        home.add(new Cat());

        Owner owner = new Owner();
        home.action(owner);

        SomeOne someone = new SomeOne();
        home.action(someone);
    }
}
