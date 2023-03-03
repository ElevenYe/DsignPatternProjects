package com.dsign.structural.DecoratorPattern;

import com.dsign.structural.DecoratorPattern.impl.ConcreteComponent;
import com.dsign.structural.DecoratorPattern.impl.ConcreteDecorator;
import com.dsign.structural.DecoratorPattern.interfaces.Component;

/**
 * 装饰器模式
 * 允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装。
 *
 * 这种模式创建了一个装饰类（ConcreteDecorator），用来包装原有的类（ConcreteComponent），并在保持类方法签名完整性的前提下，提供了额外的功能
 * （concreteDecoratorOperation()）。
 *
 * 优点：
 * 1、动态扩展类功能，比类继承灵活，且对客户端透明；
 * 2、继承关系的一种替代方案。相比与类继承的父子关系，装饰模式 更像是一种-组合关系（is-a）；
 * 3、可以对同一个被装饰对象进行多次装饰，创建出不同行为的复合功能；
 * 缺点：
 * 1、多层装饰比较复杂（灵活的同时会带来复杂性的增加）；
 * 2、装饰嵌套过多，会产生过多小对象（每个装饰层都创建一个相应的对象）；
 * 3、装饰嵌套过多，易于出错，且调试排查比较麻烦（需要一层一层对装饰器进行排查，以确定是哪一个装饰层出错）；
 *
 * 使用场景：
 * 1、在不影响其它对象的情况下，以动态、透明的方式给单个对象添加职责
 * 2、处理那些可以撤销的职责
 * 3、当使用子类扩展的方式不切实际的时候，可考虑使用装饰器模式
 * 4、Java IO包中的类设计运用了装饰器模式
 *
 * 与代理模式的区别：
 * 两者都是对类的方法进行扩展，但装饰器模式强调的是增强自身，在被装饰之后你能够在被增强的类上使用增强后的功能。增强后你还是你，只不过能力更强了而
 * 已；而代理模式则强调要让别人帮你去做一些本身与你业务没有太多关系的职责（记录日志、设置缓存）。代理模式是为了实现对象的控制，因为被代理的对象往
 * 往难以直接获得或者是其内部不想暴露出来。
 * 装饰器模式应当为所装饰的对象提供增强功能，而代理模式对所代理对象的使用施加控制，并不提供对象本身的增强功能。
 */
public class MainAction {

    public static void main(String[] args) {
        Component component = new ConcreteDecorator(new ConcreteComponent());
        component.operation();
    }
}
