package com.dsign.behavioral.StrategyPattern.impl;

import com.dsign.behavioral.StrategyPattern.interfaces.CalcInterface;

/**
 * 相加策略
 */
public class AddStrategy implements CalcInterface {
    @Override
    public void draft(int a, int b) {
        System.out.println("计算前先打个草稿: a加b");
    }

    @Override
    public void calc(int a, int b) {
        System.out.println("a + b = " + (a + b));
    }
}
