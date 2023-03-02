package com.dsign.structural.ProxyPattern.cglibdynamic.impl;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理类，黄牛
 */
public class HuangNiuProxy implements MethodInterceptor {

    private Ticketing ticketing;

    public Ticketing bind(Class realClass) {
        try {
            this.ticketing = (Ticketing) realClass.newInstance();
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.ticketing.getClass());
        enhancer.setCallback(this);
        return (Ticketing) enhancer.create();
    }

    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        Object obj = methodProxy.invokeSuper(o, objects);
        String methodName = method.getName();
        if ("paiDui".equals(methodName)) {
            System.out.println("排队真无聊，我黄牛要玩一会儿手机！");
        }
        if ("buyTickets".equals(methodName)) {
            System.out.println("终于买到票了，这一单成功完成！");
        }
        return obj;
    }
}
