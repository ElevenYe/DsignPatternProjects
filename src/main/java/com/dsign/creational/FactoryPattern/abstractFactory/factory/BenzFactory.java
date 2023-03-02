package com.dsign.creational.FactoryPattern.abstractFactory.factory;

import com.dsign.creational.FactoryPattern.abstractFactory.interfaces.CarFactoryInterface;
import com.dsign.creational.FactoryPattern.abstractFactory.interfaces.EngineInterface;
import com.dsign.creational.FactoryPattern.abstractFactory.interfaces.FrameInterface;
import com.dsign.creational.FactoryPattern.abstractFactory.impl.FlagshipEngineService;
import com.dsign.creational.FactoryPattern.abstractFactory.impl.FlagshipFrameService;
import com.dsign.creational.FactoryPattern.abstractFactory.impl.LowendEngineService;
import com.dsign.creational.FactoryPattern.abstractFactory.impl.LowendFrameService;

/**
 * 奔驰工厂，继承抽象类
 */
public class BenzFactory implements CarFactoryInterface {

    @Override
    public EngineInterface createEngine(String type) {
        System.out.println("奔驰发动机工厂");
        if ("LOW-END".equals(type)) {
            return new LowendEngineService();
        } else if ("FLAGSHIP".equals(type)) {
            return new FlagshipEngineService();
        }
        return null;
    }

    @Override
    public FrameInterface createFrame(String type) {
        System.out.println("奔驰车架工厂");
        if ("LOW-END".equals(type)) {
            return new LowendFrameService();
        } else if ("FLAGSHIP".equals(type)) {
            return new FlagshipFrameService();
        }
        return null;
    }
}
