package pattern.create.singleton.hungry.demo3;

public class Client {
    public static void main(String[] args) {
        System.out.println(Singleton.INSTANCE == Singleton.INSTANCE);
        System.out.println(Runtime.getRuntime()==Runtime.getRuntime());
        Color color =Color.RED;
        System.out.println(color);
    }
}
enum Color{
    RED,GREEN,BLUE
}
