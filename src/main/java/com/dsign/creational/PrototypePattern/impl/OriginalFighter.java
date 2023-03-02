package com.dsign.creational.PrototypePattern.impl;

import java.io.*;

/**
 * 抽象原型类
 * 以打飞机游戏中的战绩为例，敌机的属性相同，但是数值不同，因此可以使用原型机 clone 出一批敌机
 */
public abstract class OriginalFighter implements Cloneable, Serializable {

    private static final long serialVersionUID = 1L;

    // x轴
    private double abscissa;

    // y轴
    private double ordinate;

    // 血量
    private double healthPoint;

    // 攻击力
    private double atk;

    // 攻击速度
    private double attackSpeed;

    // 是否存活
    private boolean isAlive;

    // 攻击
    public abstract void attack(String command);

    /**
     * 浅克隆
     * @return
     * @throws CloneNotSupportedException
     */
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    /**
     * 深克隆
     * @return
     * @throws IOException
     * @throws ClassNotFoundException
     */
    public Object deepClone() throws IOException, ClassNotFoundException {
        /* 写入当前对象的二进制流 */
        ByteArrayOutputStream bos = new ByteArrayOutputStream();
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(this);

        /* 读出二进制流产生的新对象 */
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        ObjectInputStream ois = new ObjectInputStream(bis);
        return ois.readObject();
    }

    public double getAbscissa() {
        return abscissa;
    }

    public void setAbscissa(double abscissa) {
        this.abscissa = abscissa;
    }

    public double getOrdinate() {
        return ordinate;
    }

    public void setOrdinate(double ordinate) {
        this.ordinate = ordinate;
    }

    public double getHealthPoint() {
        return healthPoint;
    }

    public void setHealthPoint(double healthPoint) {
        this.healthPoint = healthPoint;
    }

    public double getAtk() {
        return atk;
    }

    public void setAtk(double atk) {
        this.atk = atk;
    }

    public double getAttackSpeed() {
        return attackSpeed;
    }

    public void setAttackSpeed(double attackSpeed) {
        this.attackSpeed = attackSpeed;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }
}
