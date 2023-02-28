package com.dsign.FactoryPattern.abstractFactory.factory;


import com.dsign.FactoryPattern.abstractFactory.interfaces.CarFactoryInterface;
import com.dsign.FactoryPattern.abstractFactory.interfaces.EngineInterface;
import com.dsign.FactoryPattern.abstractFactory.interfaces.FrameInterface;
import com.dsign.FactoryPattern.abstractFactory.impl.FlagshipEngineService;
import com.dsign.FactoryPattern.abstractFactory.impl.FlagshipFrameService;
import com.dsign.FactoryPattern.abstractFactory.impl.LowendEngineService;
import com.dsign.FactoryPattern.abstractFactory.impl.LowendFrameService;

/**
 * 奥迪工厂，继承抽象类
 */
public class AudiFactory implements CarFactoryInterface {

    @Override
    public EngineInterface createEngine(String type) {
        System.out.println("奥迪发动机工厂");
        if ("LOW-END".equals(type)) {
            return new LowendEngineService();
        } else if ("FLAGSHIP".equals(type)) {
            return new FlagshipEngineService();
        }
        return null;
    }

    @Override
    public FrameInterface createFrame(String type) {
        System.out.println("奥迪车架工厂");
        if ("LOW-END".equals(type)) {
            return new LowendFrameService();
        } else if ("FLAGSHIP".equals(type)) {
            return new FlagshipFrameService();
        }
        return null;
    }
}
