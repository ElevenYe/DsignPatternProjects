package com.dsign.behavioral.TemplatePattern;

public abstract class ProcessExecutor {

    abstract void validate();

    abstract void doProcess();

    abstract void sendNotify();

    public void doExecutor() {
        System.out.println("审批流程开始。。。");

        // 数据验证
        validate();

        // 流程审批
        doProcess();

        // 发送通知
        sendNotify();

        System.out.println("审批流程结束！！！");
    }
}
