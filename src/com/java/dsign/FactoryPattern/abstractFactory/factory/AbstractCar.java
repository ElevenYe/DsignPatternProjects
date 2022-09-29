package com.java.dsign.FactoryPattern.abstractFactory.factory;

import com.java.dsign.FactoryPattern.abstractFactory.iiterface.CarBrandInterface;
import com.java.dsign.FactoryPattern.abstractFactory.iiterface.CarColorInterface;

public abstract class AbstractCar {

    public abstract CarColorInterface getCarColorBean(String color);

    public abstract CarBrandInterface getCarBrandBean(String brand);
}
