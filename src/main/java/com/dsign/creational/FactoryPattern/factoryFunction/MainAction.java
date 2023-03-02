package com.dsign.creational.FactoryPattern.factoryFunction;

import com.dsign.creational.FactoryPattern.factoryFunction.factory.AudiFactory;
import com.dsign.creational.FactoryPattern.factoryFunction.factory.BenzFactory;
import com.dsign.creational.FactoryPattern.factoryFunction.factory.CarAbstractFactory;
import com.dsign.creational.FactoryPattern.factoryFunction.interfaces.CarServiceInterface;

/**
 * 工厂方法模式
 * 对简单工厂的改进，在保证单一职责的原则下使工厂模式更符合开闭原则。
 * 即新增一个具体实现类时无需对原有的工厂类和其他类做出改动，只需要新增一个实体类和实体类对应的工厂类就行了
 */
public class MainAction {

    public static void main(String[] args) {
        CarAbstractFactory carFactory = new AudiFactory();
        CarServiceInterface carService = carFactory.getCarService();
        carService.handle();

        carFactory = new BenzFactory();
        carService = carFactory.getCarService();
        carService.handle();
    }
}
