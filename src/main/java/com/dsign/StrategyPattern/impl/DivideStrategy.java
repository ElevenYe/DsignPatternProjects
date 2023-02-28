package com.dsign.StrategyPattern.impl;

import com.dsign.StrategyPattern.interfaces.CalcInterface;

/**
 * 除以策略
 */
public class DivideStrategy implements CalcInterface {
    @Override
    public void draft(int a, int b) {
        System.out.println("计算前先打个草稿: a除以b");
    }

    @Override
    public void calc(int a, int b) {
        if (b != 0) {
            System.out.println("a ÷ b = " + (a / b));
        } else {
            System.out.println("除数b为0，无法计算");
        }
    }
}
