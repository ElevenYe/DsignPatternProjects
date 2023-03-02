package com.dsign.structural.AdapterPattern.impl;

import com.dsign.structural.AdapterPattern.interfaces.PartnerLogger;

public class PartnerLoggerService implements PartnerLogger {

    @Override
    public void printLog() {
        System.out.println("第三方日志输出！");
    }
}
