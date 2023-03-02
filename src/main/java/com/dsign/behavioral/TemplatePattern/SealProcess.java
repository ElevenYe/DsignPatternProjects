package com.dsign.behavioral.TemplatePattern;

public class SealProcess extends ProcessExecutor {
    @Override
    void validate() {
        System.out.println("用印流程参数验证通过！");
    }

    @Override
    void doProcess() {
        System.out.println("用印流程审批通过！");
    }

    @Override
    void sendNotify() {
        System.out.println("完成审批流程，给下一个流程审批人发送信息。");
    }
}
