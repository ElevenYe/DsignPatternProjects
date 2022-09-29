package com.java.dsign.FactoryPattern.simpleFactory;

import com.java.dsign.FactoryPattern.simpleFactory.impl.BenzService;
import com.java.dsign.FactoryPattern.simpleFactory.impl.CarFactory;

/**
 * <pre>
 * 简单工厂模式
 * 将所有bean的实例都交由工厂类实现，调用方在根据参数获取类的实例，每次调用工厂类都会实例化一个类
 * </pre>
 */
public class MainAction {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        BenzService benzService = (BenzService) carFactory.getCarBean("Benz");
        benzService.describe();
    }
}
