package com.java.dsign.ProxyPattern.normal.impl;

import com.java.dsign.ProxyPattern.normal.iinterface.BuyTrainTickets;

/**
 * 代理类，黄牛
 */
public class HuangNiuProxy implements BuyTrainTickets {

    private BuyTrainTickets buyTrainTickets;

    public HuangNiuProxy(BuyTrainTickets trainTicketHall) {
        this.buyTrainTickets = trainTicketHall;
    }

    public HuangNiuProxy() {
        if (buyTrainTickets == null) {
            this.buyTrainTickets = new TrainTicketHall();
        }
    }

    @Override
    public void buyTickets() {
        System.out.println("排队中。。。");
        buyTrainTickets.buyTickets();
    }

}
