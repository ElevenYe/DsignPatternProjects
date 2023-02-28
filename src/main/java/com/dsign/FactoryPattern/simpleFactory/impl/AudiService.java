package com.dsign.FactoryPattern.simpleFactory.impl;

import com.dsign.FactoryPattern.simpleFactory.interfaces.CarInterface;

public class AudiService implements CarInterface {
    @Override
    public void describe() {
        System.out.println("我是奥迪车！");
    }
}
