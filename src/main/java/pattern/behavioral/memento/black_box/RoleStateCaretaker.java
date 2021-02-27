package pattern.behavioral.memento.black_box;

import pattern.behavioral.memento.white_box.RoleStateMemento;

// 备忘录对象管理角色
public class RoleStateCaretaker {

    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}
