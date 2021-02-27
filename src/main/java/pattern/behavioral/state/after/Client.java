package pattern.behavioral.state.after;

//测试类
public class Client {
    public static void main(String[] args) {
        Context context = new Context();
        // 设置当前电梯状态
        context.setLiftState(new RunningState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}