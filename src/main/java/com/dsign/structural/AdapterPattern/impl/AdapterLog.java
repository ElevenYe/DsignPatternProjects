package com.dsign.structural.AdapterPattern.impl;

import com.dsign.structural.AdapterPattern.interfaces.OurLogger;
import com.dsign.structural.AdapterPattern.interfaces.PartnerLogger;

public class AdapterLog implements OurLogger {

    PartnerLogger partnerLogger;

    public AdapterLog(PartnerLogger partnerLogger) {
        this.partnerLogger = partnerLogger;
    }

    @Override
    public void outputLog() {
        System.out.println("我们的日志输出！");
        partnerLogger.printLog();
    }
}
