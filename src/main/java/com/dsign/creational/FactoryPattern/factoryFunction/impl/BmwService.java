package com.dsign.creational.FactoryPattern.factoryFunction.impl;

import com.dsign.creational.FactoryPattern.factoryFunction.interfaces.CarServiceInterface;

public class BmwService implements CarServiceInterface {
    @Override
    public void handle() {
        System.out.println("我是宝马车！");
    }
}
