package com.java.dsign.ChainOfResponsibility.impl;

import org.omg.CORBA.PUBLIC_MEMBER;

/**
 * 具体的处理类 - 第二步缴费
 */
public class CSecondJiaoFei extends AbsHandler {

    public CSecondJiaoFei() {
        this.step = SECOND;
    }

    @Override
    public void sendMessage(int step) {
        if (step == 2) {
            System.out.println("第" + step + "步：请前往一楼大厅缴费！");
        }
    }
}
