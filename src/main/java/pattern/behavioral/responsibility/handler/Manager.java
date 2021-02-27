package pattern.behavioral.responsibility.handler;

import pattern.behavioral.responsibility.LeaveRequest;

// 部门经理
public class Manager extends Handler {
    public Manager() {
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    public void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天" + leave.getContent() + ".");
        System.out.println("部门经理审批：同意");
    }
}
