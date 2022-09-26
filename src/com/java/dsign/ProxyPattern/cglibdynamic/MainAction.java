package com.java.dsign.ProxyPattern.cglibdynamic;

import com.java.dsign.ProxyPattern.cglibdynamic.impl.HuangNiuProxy;
import com.java.dsign.ProxyPattern.cglibdynamic.impl.Ticketing;
import com.java.dsign.ProxyPattern.cglibdynamic.impl.TrainTicketHall;

/**
 * Cglib动态代理模式，基于继承类的方式
 * 相对于静态代理的优势在于：代理类无需关注被代理类是哪个，只需要被代理的类都继承了同一个父类。
 */
public class MainAction {

    public static void main(String[] args) {
        HuangNiuProxy huangNiuProxy = new HuangNiuProxy();
        Ticketing huangNiu = huangNiuProxy.bind(TrainTicketHall.class);
        huangNiu.paiDui();
        huangNiu.buyTickets();
    }
}
