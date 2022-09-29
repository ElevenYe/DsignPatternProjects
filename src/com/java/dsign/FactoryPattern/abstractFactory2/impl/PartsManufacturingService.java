package com.java.dsign.FactoryPattern.abstractFactory2.impl;

import com.java.dsign.FactoryPattern.abstractFactory2.iiterface.PartsManufacturingFactory;

public class PartsManufacturingService implements PartsManufacturingFactory {
    @Override
    public void doing() {
        System.out.println("零部件制造中。。。");
    }
}
