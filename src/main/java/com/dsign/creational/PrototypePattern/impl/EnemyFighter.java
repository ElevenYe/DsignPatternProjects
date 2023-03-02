package com.dsign.creational.PrototypePattern.impl;

/**
 * 具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
 */
public class EnemyFighter extends OriginalFighter{

    @Override
    public void attack(String command) {
        System.out.println(command);
    }
}
