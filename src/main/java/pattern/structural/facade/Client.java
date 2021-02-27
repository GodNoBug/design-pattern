package pattern.structural.facade;

public class Client {
    public static void main(String[] args) {
        // 只需创建智能音箱对象
        SmartApplianceFacade facade=new SmartApplianceFacade();
        facade.say("打开家电");
        System.out.println("=============");
        facade.say("关闭家电");
    }
}
