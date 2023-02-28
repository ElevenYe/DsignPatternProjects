package com.dsign.FactoryPattern.factoryFunction.factory;

import com.dsign.FactoryPattern.factoryFunction.interfaces.CarServiceInterface;
import com.dsign.FactoryPattern.factoryFunction.impl.BmwService;

/**
 * 宝马工厂-抽象工厂子类
 */
public class BmwFactory extends CarAbstractFactory {

    @Override
    protected CarServiceInterface init() {
        return new BmwService();
    }
}
