package com.java.dsign.ProxyPattern.dynamic.impl;

import com.java.dsign.ProxyPattern.dynamic.iinterface.BuyTrainTickets;

public class APP12306Channel implements BuyTrainTickets {
    @Override
    public void paiDui() {
        System.out.println("不用排队");
    }

    @Override
    public void buyTickets() {
        System.out.println("【12306】恭喜您！成功抢购到【上海】至【乌鲁木齐】的火车票，祝您旅途愉快！");
    }
}
