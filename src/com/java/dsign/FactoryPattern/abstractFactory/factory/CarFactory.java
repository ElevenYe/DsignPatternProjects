package com.java.dsign.FactoryPattern.abstractFactory.factory;

import com.java.dsign.FactoryPattern.abstractFactory.iiterface.CarInterface;

/**
 * 获取工厂类的超级工厂
 */
public class CarFactory {

    public AbstractCar getCarBean(String type) {
        if ("Brand".equals(type)) {
            return new CarBrandFactory();
        } else if ("Color".equals(type)) {
            return new CarColorFactory();
        } else {
            return null;
        }
    }
}
