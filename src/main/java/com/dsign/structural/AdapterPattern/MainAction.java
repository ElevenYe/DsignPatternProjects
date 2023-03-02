package com.dsign.structural.AdapterPattern;

import com.dsign.structural.AdapterPattern.impl.AdapterLog;
import com.dsign.structural.AdapterPattern.impl.PartnerLoggerService;
import com.dsign.structural.AdapterPattern.interfaces.OurLogger;

/**
 * 适配器模式
 * 将一个接口转换为客户端所期待的接口，从而使两个接口不兼容的类可以在一起工作
 *
 * 使用场景
 * ·当需要使用一个现存的类，但它提供的接口与我们系统的接口不兼容，而我们还不能修改它时
 * ·当多个团队独立开发系统的各功能模块，然后组合在一起，但由于某些原因事先不能确定接口时
 */
public class MainAction {

    public static void main(String[] args) {
        OurLogger ourLogger = new AdapterLog(new PartnerLoggerService());
        ourLogger.outputLog();
    }
}
