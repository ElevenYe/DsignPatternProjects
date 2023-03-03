package com.dsign.structural.DecoratorPattern.impl;

import com.dsign.structural.DecoratorPattern.interfaces.Component;

/**
 * 具体装饰类
 * 抽象装饰类的子类，负责向构件添加新的职责。每一个具体装饰类都定义了一些新的行为，它可以调用在抽象装饰类中定义的方法，并可以增加新的方法用以扩充
 * 对象的行为。
 */
public class ConcreteDecorator extends Decorator {

    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        // 调用在抽象装饰类中定义的方法
        super.operation();
        // 增加新的方法用以扩充对象的行为
        concreteDecoratorOperation();
    }

    /**
     * 对现有对象（构造器传入的对象）方法的补充
     */
    private void concreteDecoratorOperation() {
        System.out.println("concreteDecoratorOperation: 我是具体装饰类新增的方法，用以扩充对象（ConcreteComponent）的行为。");
    }

}
