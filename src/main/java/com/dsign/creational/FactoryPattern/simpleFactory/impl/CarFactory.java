package com.dsign.creational.FactoryPattern.simpleFactory.impl;

import com.dsign.creational.FactoryPattern.simpleFactory.interfaces.CarInterface;

public class CarFactory {

    public CarInterface getCarBean(String carName) {
        if ("Audi".equals(carName)) {
            return new AudiService();
        } else if ("Benz".equals(carName)) {
            return new BenzService();
        } else if ("Bmw".equals(carName)) {
            return new BmwService();
        } else {
            return null;
        }
    }
}
