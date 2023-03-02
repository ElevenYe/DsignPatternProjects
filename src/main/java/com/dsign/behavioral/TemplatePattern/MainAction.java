package com.dsign.behavioral.TemplatePattern;

/**
 * 模板模式
 * 定义一个操作中的算法的骨架，而将一些步骤延迟到子类中。模板方法使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤。
 */
public class MainAction {

    public static void main(String[] args) {
        SealProcess sealProcess = new SealProcess();
        sealProcess.doExecutor();

        System.out.println();
        OvertimeProcess overtimeProcess = new OvertimeProcess();
        overtimeProcess.doExecutor();
    }
}
