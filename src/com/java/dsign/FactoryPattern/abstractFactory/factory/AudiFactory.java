package com.java.dsign.FactoryPattern.abstractFactory.factory;


import com.java.dsign.FactoryPattern.abstractFactory.iiterface.CarFactoryInterface;
import com.java.dsign.FactoryPattern.abstractFactory.iiterface.EngineInterface;
import com.java.dsign.FactoryPattern.abstractFactory.iiterface.FrameInterface;
import com.java.dsign.FactoryPattern.abstractFactory.impl.FlagshipEngineService;
import com.java.dsign.FactoryPattern.abstractFactory.impl.FlagshipFrameService;
import com.java.dsign.FactoryPattern.abstractFactory.impl.LowendEngineService;
import com.java.dsign.FactoryPattern.abstractFactory.impl.LowendFrameService;

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
