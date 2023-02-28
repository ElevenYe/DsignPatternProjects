package com.dsign.FactoryPattern.factoryFunction.interfaces;

/**
 * 汽车接口-具体实体类的统一接口
 * 所有具体的实体类都继承改接口，用于工厂类将返回的实体类抽象成一个统一接口。
 */
public interface CarServiceInterface {

    void handle();
}
