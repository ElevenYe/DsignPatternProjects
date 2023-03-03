package com.dsign.behavioral.ObserverPattern.JDKObserver.Subjects;

import java.util.Observable;

/**
 * 具体主题（Concrete Subject）角色-被观察者军工基金
 * 也叫具体目标类，当具体主题的内部状态发生改变时，通知所有注册过的观察者对象。
 *
 * Observable 类是抽象目标类，它有一个 Vector 向量，用于保存所有要通知的观察者对象，下面是它最重要的 3 个方法。
 * 1、void addObserver(Observer o) 方法：用于将新的观察者对象添加到向量中。
 * 2、void notifyObservers(Object arg) 方法：调用向量中的所有观察者对象的 update。方法，通知它们数据发生改变。通常越晚加入向量的观察者越
 *    先得到通知。
 * 3、void setChange() 方法：用来设置一个 boolean 类型的内部标志位，注明目标对象发生了变化。当它为真时，notifyObservers() 才会通知观察者。
 */
public class JungongFundsSubject extends Observable {

    public void doSomething() {
        System.out.println("我是军工基金，今日跌幅10%，请通知用户进行买入处理！");
        // 设置内部标志位，注明数据发生变化，需要通知观察者们
        super.setChanged();
    }
}
