package pattern.create.singleton.hungry.demo1;

// 访问类
public class Client {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance() == Singleton.getInstance());
    }
}
