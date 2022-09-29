package com.java.dsign.FactoryPattern.abstractFactory.factory;


import com.java.dsign.FactoryPattern.abstractFactory.iiterface.CarBrandInterface;
import com.java.dsign.FactoryPattern.abstractFactory.iiterface.CarColorInterface;
import com.java.dsign.FactoryPattern.abstractFactory.impl.AudiService;
import com.java.dsign.FactoryPattern.abstractFactory.impl.BenzService;
import com.java.dsign.FactoryPattern.abstractFactory.impl.BmwService;

/**
 * 汽车品牌的工厂类，继承抽象类
 */
public class CarBrandFactory extends AbstractCar {

    @Override
    public CarColorInterface getCarColorBean(String color) {
        return null;
    }

    @Override
    public CarBrandInterface getCarBrandBean(String brand) {
        if ("Audi".equals(brand)) {
            return new AudiService();
        } else if ("Benz".equals(brand)) {
            return new BenzService();
        } else if ("Bmw".equals(brand)) {
            return new BmwService();
        } else {
            return null;
        }
    }
}
