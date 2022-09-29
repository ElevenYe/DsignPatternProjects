package com.java.dsign.FactoryPattern.abstractFactory2.impl;

import com.java.dsign.FactoryPattern.abstractFactory2.iiterface.AssembleFactory;

public class AssembleService implements AssembleFactory {
    @Override
    public void doing() {
        System.out.println("零部件组装中。。。");
    }
}
