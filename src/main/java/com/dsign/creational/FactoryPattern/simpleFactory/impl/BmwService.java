package com.dsign.creational.FactoryPattern.simpleFactory.impl;

import com.dsign.creational.FactoryPattern.simpleFactory.interfaces.CarInterface;

public class BmwService implements CarInterface {
    @Override
    public void describe() {
        System.out.println("我是宝马车！");
    }
}
