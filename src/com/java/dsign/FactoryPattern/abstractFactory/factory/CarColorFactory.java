package com.java.dsign.FactoryPattern.abstractFactory.factory;

import com.java.dsign.FactoryPattern.abstractFactory.iiterface.CarBrandInterface;
import com.java.dsign.FactoryPattern.abstractFactory.iiterface.CarColorInterface;
import com.java.dsign.FactoryPattern.abstractFactory.impl.GreenService;
import com.java.dsign.FactoryPattern.abstractFactory.impl.RedService;
import com.java.dsign.FactoryPattern.abstractFactory.impl.WhiteService;

/**
 * 汽车颜色的工厂类，继承抽象类
 */
public class CarColorFactory extends AbstractCar {

    @Override
    public CarColorInterface getCarColorBean(String color) {
        if ("Green".equals(color)) {
            return new GreenService();
        } else if ("Red".equals(color)) {
            return new RedService();
        } else if ("White".equals(color)) {
            return new WhiteService();
        } else {
            return null;
        }
    }

    @Override
    public CarBrandInterface getCarBrandBean(String brand) {
        return null;
    }
}
