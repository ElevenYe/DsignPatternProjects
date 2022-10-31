package com.java.dsign.FlyweightPattern.iiterface;

/**
 * 抽象享元
 * 图书馆的书都可以被借阅，因此所有的书都实现该接口，重写borrow方法
 */
public interface Book {

    /**
     * 借阅
     */
    void borrow();
}
