package com.java.dsign.FactoryPattern.abstractFactory;

import com.java.dsign.FactoryPattern.abstractFactory.factory.AudiFactory;
import com.java.dsign.FactoryPattern.abstractFactory.factory.BenzFactory;
import com.java.dsign.FactoryPattern.abstractFactory.iiterface.CarFactoryInterface;
import com.java.dsign.FactoryPattern.abstractFactory.iiterface.EngineInterface;
import com.java.dsign.FactoryPattern.abstractFactory.iiterface.FrameInterface;

/**
 * 抽象工厂模式
 * 超级工厂，将多个工厂类放入一个超级工厂类中管理
 *
 * 抽象工厂模式提供一个创建一系列相关或相互依赖对象的接口
 */
public class MainAction {
    public static void main(String[] args) {
        CarFactoryInterface audiFactory = new AudiFactory();
        EngineInterface audiEngine = audiFactory.createEngine("LOW-END");
        audiEngine.create();

        System.out.println();

        CarFactoryInterface benzFactory = new BenzFactory();
        FrameInterface benzFrame = benzFactory.createFrame("FLAGSHIP");
        benzFrame.create();
    }
}
