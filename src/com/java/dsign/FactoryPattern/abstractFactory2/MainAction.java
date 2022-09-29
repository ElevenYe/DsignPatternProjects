package com.java.dsign.FactoryPattern.abstractFactory2;

import com.java.dsign.FactoryPattern.abstractFactory2.factory.AudiFactory;
import com.java.dsign.FactoryPattern.abstractFactory2.iiterface.PartsManufacturingFactory;

/**
 * 抽象工厂模式
 */
public class MainAction {
    public static void main(String[] args) {
        AudiFactory audiFactory = new AudiFactory();
        PartsManufacturingFactory partsManufacturingFactory = audiFactory.getPartsManufacturingFactory();
        partsManufacturingFactory.doing();
    }
}
