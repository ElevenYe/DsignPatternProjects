package com.dsign.behavioral.ObserverPattern.JDKObserver.Observers;

import java.util.Observable;
import java.util.Observer;

/**
 * 具体观察者（Concrete Observer）角色-基金经理D
 * 实现 JDK 中的抽象观察者，以便在得到目标的更改通知时更新自身的状态。
 *
 * Observer 接口是抽象观察者，它监视目标对象的变化，当目标对象发生变化时，观察者得到通知，并调用 void update(Observable o,Object arg)
 * 方法，进行相应的工作。
 */
public class FundManagerDObserver implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("我是基金经理D，我已收到基金变动信息，当前正在处理。。。");
    }
}
