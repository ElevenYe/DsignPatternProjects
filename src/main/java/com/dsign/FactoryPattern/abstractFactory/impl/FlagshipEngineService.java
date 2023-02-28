package com.dsign.FactoryPattern.abstractFactory.impl;

import com.dsign.FactoryPattern.abstractFactory.interfaces.EngineInterface;

/**
 * 具体类-旗舰发动机
 */
public class FlagshipEngineService implements EngineInterface {
    @Override
    public void create() {
        System.out.println("完成生产旗舰发动机");
    }
}
