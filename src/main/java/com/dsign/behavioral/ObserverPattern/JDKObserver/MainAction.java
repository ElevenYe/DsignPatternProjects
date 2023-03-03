package com.dsign.behavioral.ObserverPattern.JDKObserver;

import com.dsign.behavioral.ObserverPattern.JDKObserver.Observers.FundManagerCObserver;
import com.dsign.behavioral.ObserverPattern.JDKObserver.Observers.FundManagerDObserver;
import com.dsign.behavioral.ObserverPattern.JDKObserver.Subjects.JungongFundsSubject;

/**
 * JDK中的观察者模式
 *
 * 在Java中，通过 java.util.Observable 类和 java.util.Observer 接口定义了观察者模式，只要实现它们的子类就可以编写观察者模式实例。
 */
public class MainAction {

    public static void main(String[] args) {
        JungongFundsSubject jungongFundsSubject = new JungongFundsSubject();
        jungongFundsSubject.doSomething();

        jungongFundsSubject.hasChanged();
        jungongFundsSubject.addObserver(new FundManagerCObserver());
        jungongFundsSubject.addObserver(new FundManagerDObserver());
        jungongFundsSubject.notifyObservers();
    }
}
