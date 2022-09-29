package com.java.dsign.FactoryPattern.abstractFactory.impl;

import com.java.dsign.FactoryPattern.abstractFactory.iiterface.CarBrandInterface;

public class BenzService implements CarBrandInterface {
    @Override
    public void brandDesc() {
        System.out.println("我是奔驰车！");
    }
}
