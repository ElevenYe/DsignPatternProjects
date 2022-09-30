package com.java.dsign.FactoryPattern.factoryFunction.factory;

import com.java.dsign.FactoryPattern.factoryFunction.iiterface.CarServiceInterface;

/**
 * 汽车抽象工厂-工厂类
 * 新拓展的车型可以新增该类的子类，继承该类，所有类初始化操作都可以在子类中进行，而不用此类进行修改，符合开闭原则
 */
public abstract class CarAbstractFactory {

    public CarServiceInterface getCarService() {
        return init();
    };

    protected abstract CarServiceInterface init();
}
