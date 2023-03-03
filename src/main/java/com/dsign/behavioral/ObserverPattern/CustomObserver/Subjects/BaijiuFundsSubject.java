package com.dsign.behavioral.ObserverPattern.CustomObserver.Subjects;

/**
 * 具体主题（Concrete Subject）角色-被观察者白酒基金
 * 也叫具体目标类，它实现抽象目标中的通知方法，当具体主题的内部状态发生改变时，通知所有注册过的观察者对象。
 */
public class BaijiuFundsSubject extends AbstractFundsSubject {
    @Override
    void doSomething() {
        System.out.println("我是白酒基金，今日涨幅10%，请通知用户进行卖出处理！");
    }
}
