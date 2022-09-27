package com.java.dsign.StrategyPattern.impl;

import com.java.dsign.StrategyPattern.iinterface.CalcInterface;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略执行器
 */
public class StrategyService {

    private int a;
    private int b;

    private Map<String, CalcInterface> calcMap;

    public StrategyService(int a, int b) {
        this.a = a;
        this.b = b;
        if (calcMap == null) {
            init();
        }
    }

    private void init() {
        calcMap = new HashMap<String, CalcInterface>();
        calcMap.put("add", new AddStrategy());
        calcMap.put("subtract", new SubtractStrategy());
        calcMap.put("multiply", new MultiplyStrategy());
        calcMap.put("divide", new DivideStrategy());
    }

    public void excute(String active) {
        System.out.println("你即将进行计算。。。");
        calcMap.get(active).draft(a, b);

        calcMap.get(active).calc(a, b);
        System.out.println("恭喜你，计算完成");
    }
}
