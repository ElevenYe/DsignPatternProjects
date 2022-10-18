package com.java.dsign.FactoryPattern.abstractFactory.impl;

import com.java.dsign.FactoryPattern.abstractFactory.iiterface.FrameInterface;

/**
 * 具体类-低端车架制造
 */
public class LowendFrameService implements FrameInterface {
    @Override
    public void create() {
        System.out.println("完成生产旗舰发动机");
    }
}
