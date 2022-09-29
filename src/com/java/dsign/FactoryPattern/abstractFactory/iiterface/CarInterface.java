package com.java.dsign.FactoryPattern.abstractFactory.iiterface;

public interface CarInterface {

    CarColorInterface getCarColorBean(String color);

    CarBrandInterface getCarBrandBean(String brand);
}
