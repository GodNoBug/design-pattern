package pattern.create.singleton.hungry.demo3;
// 枚举方式实现

/**
 * 饿汉式-枚举方式实现
 * 枚举类实现单例模式是极力推荐的单例实现模式，因为枚举类型是线程安全的，并且只会装载一次，设计者充分的利用了枚举的这个特性来实现单例模式，枚举的写法非常简单，而且枚举类型是所用单例实现中唯一一种不会被破坏的单例实现模式。
 */
public enum Singleton {
    INSTANCE;
}
// 枚举是一个特殊的类,一般表示一组常量
// 每个枚举都是通过 Class 在内部实现的，且所有的枚举值都是 public static final 的。
// enum 定义的枚举类默认继承了 java.lang.Enum 类，并实现了 java.lang.Seriablizable 和 java.lang.Comparable 两个接口。
//  values(), ordinal() 和 valueOf() 方法位于 java.lang.Enum 类中：

// 枚举跟普通类一样可以用自己的变量、方法和构造函数，构造函数只能使用 private 访问修饰符，所以外部无法调用。
// 枚举既可以包含具体方法，也可以包含抽象方法。 如果枚举类具有抽象方法，则枚举类的每个实例都必须实现它。

// 代码等同
// class Singleton extends Enum {
//      public static final Singleton INSTANCE = new Singleton()
// }
