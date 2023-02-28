package com.dsign.ProxyPattern.normal;

import com.dsign.ProxyPattern.normal.interfaces.BuyTrainTickets;
import com.dsign.ProxyPattern.normal.impl.HuangNiuProxy;

/**
 * 静态代理模式
 * 在对无法进行更改的类方法（例如jar包中的方法）调用前后做业务操作或日志操作时，可以通过代理模式完成
 */
public class MainAction {

    public static void main(String[] args) {
        BuyTrainTickets huangNiuProxy = new HuangNiuProxy();
        huangNiuProxy.buyTickets();
    }
}
