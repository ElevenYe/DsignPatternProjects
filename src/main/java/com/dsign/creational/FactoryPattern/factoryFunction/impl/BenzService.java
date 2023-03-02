package com.dsign.creational.FactoryPattern.factoryFunction.impl;

import com.dsign.creational.FactoryPattern.factoryFunction.interfaces.CarServiceInterface;

public class BenzService implements CarServiceInterface {
    @Override
    public void handle() {
        System.out.println("我是奔驰车！");
    }
}
