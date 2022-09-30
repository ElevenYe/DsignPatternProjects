package com.java.dsign.FactoryPattern.factoryFunction.factory;

import com.java.dsign.FactoryPattern.factoryFunction.iiterface.CarServiceInterface;
import com.java.dsign.FactoryPattern.factoryFunction.impl.BenzService;

/**
 * 奔驰工厂-抽象工厂子类
 */
public class BenzFactory extends CarAbstractFactory {

    @Override
    protected CarServiceInterface init() {
        return new BenzService();
    }
}
