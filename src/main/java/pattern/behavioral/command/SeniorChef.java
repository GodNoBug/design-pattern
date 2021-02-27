package pattern.behavioral.command;

// 高级厨师 就是接收者角色,真正的命令执行的对象
public class SeniorChef {
    public void makeFood(int num, String foodName) {
        System.out.println(num + "份" + foodName);
    }
}
