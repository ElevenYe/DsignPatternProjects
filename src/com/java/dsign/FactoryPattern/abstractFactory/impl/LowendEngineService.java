package com.java.dsign.FactoryPattern.abstractFactory.impl;

import com.java.dsign.FactoryPattern.abstractFactory.iiterface.EngineInterface;

/**
 * 具体类-低端发动机
 */
public class LowendEngineService implements EngineInterface {
    @Override
    public void create() {
        System.out.println("完成生产低端发动机");
    }
}
