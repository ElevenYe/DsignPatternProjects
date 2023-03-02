package com.dsign.behavioral.ChainOfResponsibility;


import com.dsign.behavioral.ChainOfResponsibility.impl.AbsHandler;
import com.dsign.behavioral.ChainOfResponsibility.impl.BFirstGuaHao;
import com.dsign.behavioral.ChainOfResponsibility.impl.CSecondJiaoFei;
import com.dsign.behavioral.ChainOfResponsibility.impl.DThirdKanBing;

/**
 * 责任链模式
 * 适用于没有特殊业务处理，上下级关系十分紧密，层次分明的场景。
 *
 * 角色：
 * 抽象的处理类：保存了下一个节点的类，负责将对应的实现类串联起来形成一条责任链，自上而下进行传递
 * 具体的处理类：继承抽象类，业务的具体实现
 *
 * 使用场景：审批流程
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
