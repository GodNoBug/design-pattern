package pattern.behavioral.observer.subject;

import pattern.behavioral.observer.observer.Observer;

// 抽象主题角色类
public interface Subject {
    // 添加订阅者(添加观察者对象)
    void attach(Observer observer);
    // 删除订阅者
    void detach(Observer observer);

    // 通知观察者更新消息
    void notify(String message);
}
