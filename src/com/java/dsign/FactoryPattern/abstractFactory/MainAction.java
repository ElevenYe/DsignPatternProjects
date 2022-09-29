package com.java.dsign.FactoryPattern.abstractFactory;

import com.java.dsign.FactoryPattern.abstractFactory.factory.AbstractCar;
import com.java.dsign.FactoryPattern.abstractFactory.factory.CarBrandFactory;
import com.java.dsign.FactoryPattern.abstractFactory.factory.CarFactory;
import com.java.dsign.FactoryPattern.abstractFactory.iiterface.CarBrandInterface;
import com.java.dsign.FactoryPattern.abstractFactory.iiterface.CarColorInterface;

/**
 * 抽象工厂模式
 * 超级工厂，将多个工厂类放入一个超级工厂类中管理
 *
 * 抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口
 */
public class MainAction {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        AbstractCar abstractCar = carFactory.getCarBean("Brand");
        CarBrandInterface carBrand = abstractCar.getCarBrandBean("Benz");
        carBrand.brandDesc();

        abstractCar = carFactory.getCarBean("Color");
        CarColorInterface carColor = abstractCar.getCarColorBean("Red");
        carColor.colorDesc();
    }
}
