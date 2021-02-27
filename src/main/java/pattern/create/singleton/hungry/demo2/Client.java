package pattern.create.singleton.hungry.demo2;

// 访问类
public class Client {
    public static void main(String[] args) {
        System.out.println(Singleton.getInstance() == Singleton.getInstance());
    }
}
