package com.java.dsign.ProxyPattern.normal.impl;

import com.java.dsign.ProxyPattern.normal.iinterface.BuyTrainTickets;

/**
 * 官方购买车票渠道，火车站售票大厅购买
 */
public class TrainTicketHall implements BuyTrainTickets {
    @Override
    public void buyTickets() {
        System.out.println("恭喜您！成功抢购到【上海】至【乌鲁木齐】的火车票，祝您旅途愉快！");
    }
}
