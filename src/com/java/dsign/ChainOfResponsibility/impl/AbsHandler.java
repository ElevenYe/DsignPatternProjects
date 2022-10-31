package com.java.dsign.ChainOfResponsibility.impl;

/**
 * 抽象的处理类 - 处理器
 */
public abstract class AbsHandler {

    public final static int FIRST = 1;

    public final static int SECOND = 2;

    public final static int THIRD = 3;

    /**
     * 下一级处理
     */
    private AbsHandler nextHandler;

    protected int step;

    public void setNextHandler(AbsHandler handler) {
        this.nextHandler = handler;
    }

    public void doHandle(int step) {
        if (this.step == step) {
            // 子类实现的实际业务
            sendMessage(step);
        } else {
            // 向下传递
            nextHandler.doHandle(step);
        }
    }

    protected abstract void sendMessage(int step);
}
