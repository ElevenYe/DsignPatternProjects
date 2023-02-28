package com.dsign.FactoryPattern.abstractFactory.impl;

import com.dsign.FactoryPattern.abstractFactory.interfaces.EngineInterface;

/**
 * 具体类-低端发动机
 */
public class LowendEngineService implements EngineInterface {
    @Override
    public void create() {
        System.out.println("完成生产低端发动机");
    }
}
