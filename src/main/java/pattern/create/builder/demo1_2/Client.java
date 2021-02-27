package pattern.create.builder.demo1_2;

// 对于客户端来说
public class Client {
    public static void main(String[] args) {
        // 创建指挥者对象
        Builder builder=new MobileBuilder();
        // 让指挥者指挥组装自行车
        Bike bike = builder.construct();
        // 车座和车架已经组装好了
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
