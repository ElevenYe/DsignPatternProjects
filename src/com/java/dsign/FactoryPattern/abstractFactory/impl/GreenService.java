package com.java.dsign.FactoryPattern.abstractFactory.impl;

import com.java.dsign.FactoryPattern.abstractFactory.iiterface.CarColorInterface;

public class GreenService implements CarColorInterface {
    @Override
    public void colorHandle() {
        System.out.println("绿色");
    }
}
