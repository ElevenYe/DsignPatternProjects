package com.dsign.behavioral.ObserverPattern.CustomObserver.Subjects;

import com.dsign.behavioral.ObserverPattern.CustomObserver.Observers.FundsObserver;

import java.util.ArrayList;
import java.util.List;

/**
 * 抽象主题（Subject）角色-被观察者基金
 * 也叫抽象目标类，它提供了一个用于保存观察者对象的聚集类和增加、删除观察者对象的方法，以及通知所有观察者的抽象方法。
 */
public abstract class AbstractFundsSubject {

    List<FundsObserver> fundsObservers = new ArrayList<>();

    /**
     * 添加观察者
     * @param fundsObserver
     */
    public void addObserver(FundsObserver fundsObserver) {
        if (!fundsObservers.contains(fundsObserver))
            fundsObservers.add(fundsObserver);
    }

    /**
     * 删除观察者
     * @param fundsObserver
     */
    public void deleteObserver(FundsObserver fundsObserver) {
        if (fundsObservers.contains(fundsObserver))
            fundsObservers.remove(fundsObserver);
    }

    /**
     * 通知所有的观察者
     */
    private void notifyObservers() {
        fundsObservers.forEach(p -> {
            p.update();
        });
    }

    public void doExecution() {
        doSomething();
        notifyObservers();
    }

    abstract void doSomething();
}
