package com.dsign.creational.PrototypePattern;

import com.dsign.creational.PrototypePattern.impl.EnemyFighter;

import java.io.IOException;

/**
 * 原型模式
 * 用一个已经创建的实例（下文中的 firstEnemyFighter ）作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象（下文中的
 * secondEnemyFighter 和 thirdEnemyFighter）。用于创建重复的对象，同时又能保证性能（用这种方式创建对象非常高效）。
 *
 * 原型模式是在内存二进制流的拷贝，要比new一个对象性能好很多，特别是在一个循环体类产生大量对象的时候更加明显。但是直接在内存中拷贝，构造函数是不会
 * 执行的。
 *
 * 使用场景：
 * 1、资源初始化场景：类初始化需要消耗非常多的资源的时候。
 * 2、性能和安全要求的场景：通过new产生一个对象需要非常繁琐的数据准备和访问权限的时候。
 * 3、一个对象多个修改者的场景：一个对象需要提供给其他对象访问，而各个调用者可能都需要修改其值时考虑使用。
 * 注意：实际项目中原型模式很少单独出现，一般和工厂模式一起出现，通过 clone 方法创建一个对象，然后由工厂方法提供给调用者。
 */
public class MainAction {

    public static void main(String[] args) throws CloneNotSupportedException, IOException, ClassNotFoundException {
        EnemyFighter firstEnemyFighter = new EnemyFighter();
        firstEnemyFighter.attack("我是第一架战机: " + firstEnemyFighter + "，我已开始攻击！");

        EnemyFighter secondEnemyFighter = (EnemyFighter) firstEnemyFighter.clone();
        secondEnemyFighter.attack("我是第二架战机: " + secondEnemyFighter + "，我已开始攻击！");

        EnemyFighter thirdEnemyFighter = (EnemyFighter) firstEnemyFighter.deepClone();
        thirdEnemyFighter.attack("我是第三架战机: " + thirdEnemyFighter + "，我已开始攻击！");
    }
}
