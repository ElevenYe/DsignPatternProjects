package com.java.dsign.ChainOfResponsibility;

import com.java.dsign.ChainOfResponsibility.impl.BFirstGuaHao;
import com.java.dsign.ChainOfResponsibility.impl.AbsHandler;
import com.java.dsign.ChainOfResponsibility.impl.CSecondJiaoFei;
import com.java.dsign.ChainOfResponsibility.impl.DThirdKanBing;

/**
 * 责任链模式
 * 适用于没有特殊业务处理，上下级关系十分紧密，层次分明的场景。
 * 例如：审批流程
 */
public class MainAction extends AbsHandler {

    public MainAction() {
        // 串联
        AbsHandler bFirstGuaHao = new BFirstGuaHao();
        AbsHandler cSecondJiaoFei = new CSecondJiaoFei();
        AbsHandler dThirdKanBing = new DThirdKanBing();

        setNextHandler(bFirstGuaHao);
        bFirstGuaHao.setNextHandler(cSecondJiaoFei);
        cSecondJiaoFei.setNextHandler(dThirdKanBing);
    }
    @Override
    public void sendMessage(int step) {
        doHandle(step);
    }

    public static void main(String[] args) {
        AbsHandler seeADoctor= new MainAction();
        seeADoctor.doHandle(1);
        seeADoctor.doHandle(2);
        seeADoctor.doHandle(3);
    }
}
