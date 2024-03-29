package com.dsign.creational.FactoryPattern.abstractFactory.impl;

import com.dsign.creational.FactoryPattern.abstractFactory.interfaces.FrameInterface;

/**
 * 具体类-旗舰车架制造
 */
public class FlagshipFrameService implements FrameInterface {
    @Override
    public void create() {
        System.out.println("完成生产旗舰车架");
    }
}
