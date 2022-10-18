package com.java.dsign.FactoryPattern.abstractFactory.impl;

import com.java.dsign.FactoryPattern.abstractFactory.iiterface.FrameInterface;

/**
 * 具体类-旗舰车架制造
 */
public class FlagshipFrameService implements FrameInterface {
    @Override
    public void create() {
        System.out.println("完成生产旗舰车架");
    }
}
