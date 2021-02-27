package pattern.behavioral.responsibility;

import pattern.behavioral.responsibility.handler.GeneralManager;
import pattern.behavioral.responsibility.handler.GroupLeader;
import pattern.behavioral.responsibility.handler.Manager;

public class Client {
    public static void main(String[] args) {
        // 创建一个请假条对象
        LeaveRequest leave = new LeaveRequest("张三", 3, "身体不适");

        // 创建各级领导对象
        GroupLeader groupLeader = new GroupLeader();
        Manager manager = new Manager();
        GeneralManager generalManager = new GeneralManager();

        // 设置处理者链
        groupLeader.setNextHandler(manager);
        manager.setNextHandler(generalManager);

        // 小明提交请假申请
        groupLeader.submit(leave);
    }
}
