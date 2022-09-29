package com.java.dsign.FactoryPattern.abstractFactory2.iiterface;

/**
 * 汽车工厂接口
 */
public interface CarFactory {

    /**
     * 获取零部件生产工厂
     * @return
     */
    PartsManufacturingFactory getPartsManufacturingFactory();

    /**
     * 获取零部件组装工厂
     * @return
     */
    AssembleFactory getAssembleFactory();

    /**
     * 获取喷漆工厂
     * @return
     */
    PenqiFactory getPenqiFactory();
}
