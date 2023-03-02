package com.dsign.creational.FactoryPattern.factoryFunction.factory;

import com.dsign.creational.FactoryPattern.factoryFunction.interfaces.CarServiceInterface;
import com.dsign.creational.FactoryPattern.factoryFunction.impl.BenzService;

/**
 * 奔驰工厂-抽象工厂子类
 */
public class BenzFactory extends CarAbstractFactory {

    @Override
    protected CarServiceInterface init() {
        return new BenzService();
    }
}
