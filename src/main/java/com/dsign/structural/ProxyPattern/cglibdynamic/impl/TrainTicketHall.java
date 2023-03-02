package com.dsign.structural.ProxyPattern.cglibdynamic.impl;

/**
 * 官方购买车票渠道，火车站售票大厅购买
 * 假设该类为12306提供的SDK，不能被修改
 */
public class TrainTicketHall extends Ticketing{

    @Override
    public void paiDui() {
        System.out.println("售票窗口前排队。。。");
    }


    @Override
    public void buyTickets() {
        System.out.println("【虹桥火车站】恭喜您！成功抢购到【上海】至【乌鲁木齐】的火车票，祝您旅途愉快！");
    }
}
