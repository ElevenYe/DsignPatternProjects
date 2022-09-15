package com.java.dsign.ProxyPattern.normal;

import com.java.dsign.ProxyPattern.normal.iinterface.BuyTrainTickets;
import com.java.dsign.ProxyPattern.normal.impl.HuangNiuProxy;

/**
 * 代理模式
 */
public class MainAction {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        BuyTrainTickets huangNiuProxy = new HuangNiuProxy();
        huangNiuProxy.buyTickets();
    }
}
