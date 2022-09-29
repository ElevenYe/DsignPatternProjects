package com.java.dsign.FactoryPattern.abstractFactory2.impl;

import com.java.dsign.FactoryPattern.abstractFactory2.iiterface.PenqiFactory;

public class PenqiService implements PenqiFactory {
    @Override
    public void doing() {
        System.out.println("汽车喷漆中。。。");
    }
}
