package com.dsign.creational.FactoryPattern.factoryFunction.factory;

import com.dsign.creational.FactoryPattern.factoryFunction.interfaces.CarServiceInterface;
import com.dsign.creational.FactoryPattern.factoryFunction.impl.AudiService;

/**
 * 奥迪工厂-抽象工厂子类
 * 新拓展的车型可以新增一个工厂类的子类，所有类初始化都可以在子类中进行，而不用对工厂类进行修改，符合开闭原则
 */
public class AudiFactory extends CarAbstractFactory {

    @Override
    protected CarServiceInterface init() {
        return new AudiService("奥古斯特·霍希");
    }
}
