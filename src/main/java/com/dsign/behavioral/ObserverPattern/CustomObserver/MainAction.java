package com.dsign.behavioral.ObserverPattern.CustomObserver;

import com.dsign.behavioral.ObserverPattern.CustomObserver.Observers.FundManagerAObserver;
import com.dsign.behavioral.ObserverPattern.CustomObserver.Observers.FundManagerBObserver;
import com.dsign.behavioral.ObserverPattern.CustomObserver.Subjects.BaijiuFundsSubject;

/**
 * 观察者模式
 * 指多个对象间存在一对多的依赖关系，当一个对象的状态发生改变时，所有依赖于它的对象都得到通知并被自动更新。这种模式有时又称作发布-订阅模式、
 * 模型-视图模式，它是对象行为型模式。
 *
 * 优点：
 * 1、降低了目标与观察者之间的耦合关系，两者之间是抽象耦合关系。
 * 2、标与观察者之间建立了一套触发机制。
 * 缺点：
 * 1、目标与观察者之间的依赖关系并没有完全解除，而且有可能出现循环引用。
 * 2、当观察者对象很多时，通知的发布会花费很多时间，影响程序的效率。
 *
 * 实现观察者模式时要注意具体目标对象和具体观察者对象之间不能直接调用，否则将使两者之间紧密耦合起来，这违反了面向对象的设计原则。
 *
 * 使用场景：
 * 1、对象间存在一对多关系，一个对象的状态发生改变会影响其他对象。
 * 2、当一个抽象模型有两个方面，其中一个方面依赖于另一方面时，可将这二者封装在独立的对象中以使它们可以各自独立地改变和复用。
 * 3、系统存在事件多级触发时；
 * 4、一个对象仅需要将自己的更新通知给其它对象而不需要知道其它对象细节时，如消息推送；
 * 5、跨系统的消息交换场景，如通信过程中的消息队列处理机制。
 */
public class MainAction {

    public static void main(String[] args) {
        BaijiuFundsSubject baijiuFundsSubject = new BaijiuFundsSubject();
        // 添加基金经理A为观察者
        baijiuFundsSubject.addObserver(new FundManagerAObserver());
        // 添加基金经理B为观察者
        baijiuFundsSubject.addObserver(new FundManagerBObserver());

        // 处理业务逻辑，处理完后将会通知观察者进行处理
        baijiuFundsSubject.doExecution();
    }
}
