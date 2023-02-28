package com.dsign.StrategyPattern;

import com.dsign.StrategyPattern.impl.StrategyService;

/**
 * 策略模式
 * <pre>
 * 实例化策略器类StrategyService时就完成所有具体策略（加减乘除的具体类）的实例。
 * 策略器类的自定义方法（excute）以实现具体策略类方法（calc）的调用
 * 我们可以将具体策略中的共通方法取出来任意进行组合，也可以在策略器类的自定义方法（excute）中做任何事情。而策略的使用方只关注调用参数，剩下的
 * 交由策略器完成。
 * </pre>
 */
public class MainAction {

    public static void main(String[] args) {
        StrategyService service = new StrategyService(10, 2);
        service.execute("add");
    }
}
