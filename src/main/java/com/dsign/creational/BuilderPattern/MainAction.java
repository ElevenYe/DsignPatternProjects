package com.dsign.creational.BuilderPattern;

/**
 * 建造者模式
 * 一个 Builder 类会一步一步构造最终的对象。该 Builder 类是独立于其他对象的。
 *
 * 与工程模式的区别就是：工厂模式关注的是创建单个产品，而建造者模式则关注创建符合对象，多个部分。
 *
 * 使用场景：
 * 当一个类的构造函数参数个数超过4个，而且这些参数有些是可选的参数，考虑使用构造者模式。
 *
 * java中的 StringBuilder 就用到了建造者模式
 */
public class MainAction {

    public static void main(String[] args) {
        Computer computer = new Computer.Builder("AMD", "三星")
                .setKeyboard("技嘉")
                .setDisplay("明基")
                .setUsbCount(6)
                .build();
        System.out.println(computer.toString());
    }
}
