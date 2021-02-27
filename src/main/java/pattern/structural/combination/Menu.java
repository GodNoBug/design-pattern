package pattern.structural.combination;

import java.util.ArrayList;
import java.util.List;

public class Menu extends MenuComponent {

    // 菜单可以有多个子菜单或子菜单项
    private List<MenuComponent> menuComponentList=new ArrayList<>();

    public Menu(String name,int level){
        this.level = level;
        this.name = name;
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int i) {
        return menuComponentList.get(i);
    }

    @Override
    public void print() {
        for (int i = 1; i < level; i++) {
            System.out.print("--");
        }
        // 打印菜单名称
        System.out.println(name);
        // 打印子菜单或者子菜单项的名称
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }
}