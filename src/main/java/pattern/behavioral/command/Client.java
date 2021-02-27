package pattern.behavioral.command;

public class Client {
    public static void main(String[] args) {
        // 创建订单
        Order order = new Order();
        order.setDiningTable(1);
        order.setFood("西红柿鸡蛋面", 1);
        order.setFood("小杯可乐", 2);
        Order order2 = new Order();
        order2.setDiningTable(2);
        order2.setFood("青椒肉丝盖饭", 1);
        order2.setFood("小杯雪碧", 1);

        // 创建厨师对象
        SeniorChef receiver = new SeniorChef();
        // 创建命令对象
        Command command = new OrderCommand(receiver, order);
        Command command2 = new OrderCommand(receiver, order2);

        // 创建调用者
        Waiter invoke = new Waiter();
        invoke.setCommand(command);
        invoke.setCommand(command2);

        // 让服务员发起命令
        invoke.orderUp();
    }
}
