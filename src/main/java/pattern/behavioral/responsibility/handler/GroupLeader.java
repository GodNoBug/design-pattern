package pattern.behavioral.responsibility.handler;

import pattern.behavioral.responsibility.LeaveRequest;

// 小组长类
public class GroupLeader extends Handler {
    public GroupLeader() {
        super(0, Handler.NUM_ONE);
    }

    @Override
    public void handleLeave(LeaveRequest leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天" + leave.getContent()+".");
        System.out.println("小组长审批：同意");
    }
}
