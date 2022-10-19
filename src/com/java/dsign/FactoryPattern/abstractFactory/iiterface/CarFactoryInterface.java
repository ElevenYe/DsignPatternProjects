package com.java.dsign.FactoryPattern.abstractFactory.iiterface;

/**
 * 汽车抽象工厂
 */
public interface CarFactoryInterface {

    /**
     * 生产发动机
     * @return
     */
    EngineInterface createEngine(String type);

    /**
     * 生产车架
     * @return
     */
    FrameInterface createFrame(String type);
}
