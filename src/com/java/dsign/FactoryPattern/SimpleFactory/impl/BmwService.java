package com.java.dsign.FactoryPattern.SimpleFactory.impl;

import com.java.dsign.FactoryPattern.SimpleFactory.iiterface.CarInterface;

public class BmwService implements CarInterface {
    @Override
    public void describe() {
        System.out.println("我是宝马车！");
    }
}