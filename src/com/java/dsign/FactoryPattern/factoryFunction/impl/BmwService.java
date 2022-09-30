package com.java.dsign.FactoryPattern.factoryFunction.impl;

import com.java.dsign.FactoryPattern.factoryFunction.iiterface.CarServiceInterface;

public class BmwService implements CarServiceInterface {
    @Override
    public void handle() {
        System.out.println("我是宝马车！");
    }
}
