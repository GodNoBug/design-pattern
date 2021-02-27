package pattern.behavioral.command;

import java.util.ArrayList;

// 服务员 调用者角色,有她来发起命令
public class Waiter {
    private ArrayList<Command> commands = new ArrayList<>();

    // 发起命令功能 喊 订单来了
    public void orderUp() {
        System.out.println("美女服务员：大厨,新订单来了...");
        for (Command command : commands) {
            if (command != null)
                command.execute();
        }
    }

    public void setCommand(Command command) {
        commands.add(command);
    }
}
