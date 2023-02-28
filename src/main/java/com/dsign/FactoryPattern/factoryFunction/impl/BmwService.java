package com.dsign.FactoryPattern.factoryFunction.impl;

import com.dsign.FactoryPattern.factoryFunction.interfaces.CarServiceInterface;

public class BmwService implements CarServiceInterface {
    @Override
    public void handle() {
        System.out.println("我是宝马车！");
    }
}
