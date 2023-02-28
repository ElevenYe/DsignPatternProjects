package com.dsign.ProxyPattern.dynamic;

import com.dsign.ProxyPattern.dynamic.interfaces.BuyTrainTickets;
import com.dsign.ProxyPattern.dynamic.impl.APP12306Channel;
import com.dsign.ProxyPattern.dynamic.impl.HuangNiuProxy;
import com.dsign.ProxyPattern.dynamic.impl.TrainTicketHall;

/**
 * 动态代理模式，基于接口实现类的方式
 * 相对于静态代理的优势在于：代理类无需关注被代理类是哪个，只需要被代理的类都实现了同一个接口。
 */
public class MainAction {

    public static void main(String[] args) {
        HuangNiuProxy huangNiuProxy = new HuangNiuProxy();
        BuyTrainTickets huangNiu = huangNiuProxy.bind(TrainTicketHall.class);
        huangNiu.paiDui();
        huangNiu.buyTickets();

        System.out.println();

        huangNiu = huangNiuProxy.bind(APP12306Channel.class);
        huangNiu.buyTickets();
    }
}
