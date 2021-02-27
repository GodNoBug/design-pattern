package pattern.behavioral.memento.white_box;

// 备忘录对象管理角色
public class RoleStateCaretaker {

    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMemento() {
        return roleStateMemento;
    }
    public void setRoleStateMemento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
