package com.java.dsign.FactoryPattern.factoryFunction.factory;

import com.java.dsign.FactoryPattern.factoryFunction.iiterface.CarServiceInterface;
import com.java.dsign.FactoryPattern.factoryFunction.impl.BmwService;

/**
 * 宝马工厂-抽象工厂子类
 */
public class BmwFactory extends CarAbstractFactory {

    @Override
    protected CarServiceInterface init() {
        return new BmwService();
    }
}
