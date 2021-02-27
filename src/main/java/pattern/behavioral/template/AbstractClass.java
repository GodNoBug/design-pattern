package pattern.behavioral.template;

// 抽象类
// 炒菜的步骤是固定的,分为倒油/热油/倒蔬菜/倒调料品/翻炒等步骤
//   其中 倒蔬菜和倒调料品是不一样的,所以定义成抽象的,其他定义成具体方法
public abstract class AbstractClass {
    // 烹饪过程 模板方法定义,固定算法,不允许子类重写
    public final void cookProcess(){
        this.pourOil();
        this.heatOil();
        this.pourVegetable();
        this.pourSauce();
        this.fry();
    }
    // 1.倒油
    public  void pourOil(){
        System.out.println("倒油");
    }
    // 2.热油
    public  void heatOil(){
        System.out.println("热油");
    }
    // 3.倒蔬菜
    public abstract void pourVegetable();
    // 4.倒调料味
    public abstract void pourSauce();
    // 5.翻炒
    public  void fry(){
        System.out.println("炒啊炒啊炒到熟啊");
    }
}
