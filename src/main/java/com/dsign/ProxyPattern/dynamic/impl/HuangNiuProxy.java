package com.dsign.ProxyPattern.dynamic.impl;

import com.dsign.ProxyPattern.dynamic.interfaces.BuyTrainTickets;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 代理类，黄牛
 */
public class HuangNiuProxy implements InvocationHandler {

    private BuyTrainTickets buyTrainTickets;

    public BuyTrainTickets bind(Class realClass) {
        try {
            this.buyTrainTickets = (BuyTrainTickets) realClass.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        return (BuyTrainTickets) Proxy.newProxyInstance(buyTrainTickets.getClass().getClassLoader()
                , buyTrainTickets.getClass().getInterfaces()
                , this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        method.invoke(buyTrainTickets, args);
        String methodName = method.getName();
        if ("paiDui".equals(methodName)) {
            System.out.println("排队真无聊，我黄牛要玩一会儿手机！");
        }
        if ("buyTickets".equals(methodName)) {
            System.out.println("终于买到票了，这一单成功完成！");
        }
        return null;
    }
}
