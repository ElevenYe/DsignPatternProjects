package com.java.dsign.FactoryPattern.simpleFactory.impl;

import com.java.dsign.FactoryPattern.simpleFactory.iiterface.CarInterface;

public class AudiService implements CarInterface {
    @Override
    public void describe() {
        System.out.println("我是奥迪车！");
    }
}
