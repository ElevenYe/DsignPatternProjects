package com.dsign.ChainOfResponsibility.impl;

/**
 * 具体的处理类 - 第三步看病
 */
public class DThirdKanBing extends AbsHandler {

    public DThirdKanBing() {
        this.step = THIRD;
    }

    @Override
    public void sendMessage(int step) {
        System.out.println("第" + step + "步：请前往三楼301室等待叫号看病！");
    }
}
