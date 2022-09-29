package com.java.dsign.FactoryPattern.abstractFactory.impl;

import com.java.dsign.FactoryPattern.abstractFactory.iiterface.CarColorInterface;

public class RedService implements CarColorInterface {
    @Override
    public void colorDesc() {
        System.out.println("红色");
    }
}
