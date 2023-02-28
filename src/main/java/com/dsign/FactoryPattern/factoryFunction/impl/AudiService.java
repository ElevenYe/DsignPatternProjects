package com.dsign.FactoryPattern.factoryFunction.impl;

import com.dsign.FactoryPattern.factoryFunction.interfaces.CarServiceInterface;

public class AudiService implements CarServiceInterface {

    private String sign;

    public AudiService(String sign) {
        this.sign = sign;
    }

    @Override
    public void handle() {
        System.out.println("我是奥迪车！我可以为你做签名：" + sign);
    }
}
