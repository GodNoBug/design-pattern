package pattern.behavioral.responsibility.handler;


import pattern.behavioral.responsibility.LeaveRequest;

// 顶层抽象处理者角色
public abstract class Handler {
    public static final int NUM_ONE = 1;
    public static final int NUM_THREE = 3;
    public static final int NUM_SEVEN = 7;

    // 该领导处理的请求天数区间
    private int numStart;
    private int numEnd;
    // 声明上级领导
    private Handler nextHandler;

    public Handler(int numStart) {
        this.numStart = numStart;
    }

    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    // 提交请假条,若超过权限则需要提交给上级领导,不能由子类重写
    public void submit(LeaveRequest leave) {
        // 该领导进行审批

        if (this.nextHandler != null && leave.getNum() > this.numEnd) {
            // 提交给上级领导进行审批
            this.nextHandler.submit(leave);
        }else {
            this.handleLeave(leave);
            System.out.println("流程结束");
        }
    }

    //各级领导处理请假条的方法
    public abstract void handleLeave(LeaveRequest leave);
}
