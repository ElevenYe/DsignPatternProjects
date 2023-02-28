package com.dsign.ChainOfResponsibility.impl;

/**
 * 具体的处理类 - 第一步挂号
 */
public class BFirstGuaHao extends AbsHandler {

    public BFirstGuaHao() {
        this.step = FIRST;
    }

    @Override
    public void sendMessage(int step) {
        if (step == 1) {
            System.out.println("第" + step + "步：请前往一楼大厅门口的自助机上预约挂号！");
        }
    }
}
