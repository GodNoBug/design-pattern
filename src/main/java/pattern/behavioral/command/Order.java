package pattern.behavioral.command;

import java.util.HashMap;
import java.util.Map;

// 订单: 命令中包含订单
public class Order {
    // 餐桌号码
    private int diningTable;
    // 所下的餐品及份数
    private Map<String, Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name, int num) {
        foodDir.put(name, num);
    }
}
