package com.dsign.behavioral.ObserverPattern.CustomObserver.Observers;

/**
 * 具体观察者（Concrete Observer）角色-基金经理B
 * 实现抽象观察者中定义的抽象方法，以便在得到目标的更改通知时更新自身的状态。
 */
public class FundManagerBObserver implements FundsObserver {
    @Override
    public void update() {
        System.out.println("我是基金经理B，我已收到基金变动信息，当前正在处理。。。");
    }
}
