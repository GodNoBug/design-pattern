package pattern.create.builder.other.after;

public class Client {
    public static void main(String[] args) {
        // 指挥者
        Phone phone=new Phone.Builder()
                .cpu("intel")
                .screen("三星屏幕")
                .memory("金士顿内存条")
                .mainBoard("华硕主板")
                .build();
        System.out.println(phone);
    }
}
