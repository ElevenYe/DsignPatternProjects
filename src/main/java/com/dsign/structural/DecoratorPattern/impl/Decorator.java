package com.dsign.structural.DecoratorPattern.impl;

import com.dsign.structural.DecoratorPattern.interfaces.Component;

/**
 * 抽象装饰类（实现了抽象组件）
 * 抽象组件类的子类，用于给具体组件增加职责，但是具体职责在其子类中实现。它维护一个指向抽象构件对象的引用，通过该引用可以调用装饰之前构件对象的方
 * 法，并通过其子类扩展该方法，以达到装饰的目的。
 */
public abstract class Decorator implements Component {

    // 维护一个指向抽象构件对象的引用，，通过该引用可以调用装饰之前构件对象的方法，并通过其子类扩展该方法，以达到装饰的目的。
    Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }

}
