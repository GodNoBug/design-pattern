package pattern.behavioral.memento.white_box;

public class Client {
    public static void main(String[] args) {
        System.out.println("=============大战Boos前==============");
        // 创建游戏角色对象
        GameRole gameRole = new GameRole();
        gameRole.initState();  // 初始化状态操作
        gameRole.stateDisplay();
        // 将游戏角色内部状态进行备份
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setRoleStateMemento(gameRole.saveState());
        System.out.println("=============大战Boos后==============");
        // 损耗严重
        gameRole.fight();
        gameRole.stateDisplay();
        System.out.println("=============恢复之前的状态==============");
        gameRole.recoverState(caretaker.getRoleStateMemento());
        gameRole.stateDisplay();
    }
}
