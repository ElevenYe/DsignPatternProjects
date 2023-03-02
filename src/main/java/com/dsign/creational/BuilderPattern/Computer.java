package com.dsign.creational.BuilderPattern;

/**
 * 在 Computer 中创建一个静态内部类 Builder，然后将 Computer 中的参数都复制到 Builder 类中。
 * 在 Computer 中创建一个 private 的构造函数，参数为 Builder 类型
 * 在 Builder 中创建一个 public 的构造函数，参数为 Computer 中必填的那些参数，cpu 和 ram。
 * 在 Builder 中创建设置函数，对 Computer 中那些可选参数进行赋值，返回值为 Builder 类型的实例
 */
public class Computer {
    private final String cpu; // 必须
    private final String ram; // 必须
    private final int usbCount; // 可选
    private final String keyboard; // 可选
    private final String display; // 可选

    private Computer(Builder builder){
        this.cpu=builder.cpu;
        this.ram=builder.ram;
        this.usbCount=builder.usbCount;
        this.keyboard=builder.keyboard;
        this.display=builder.display;
    }
    public static class Builder{
        private String cpu; // 必须
        private String ram; // 必须
        private int usbCount; // 可选
        private String keyboard; // 可选
        private String display; // 可选

        public Builder(String cup,String ram){
            this.cpu=cup;
            this.ram=ram;
        }

        public Builder setUsbCount(int usbCount) {
            this.usbCount = usbCount;
            return this;
        }
        public Builder setKeyboard(String keyboard) {
            this.keyboard = keyboard;
            return this;
        }
        public Builder setDisplay(String display) {
            this.display = display;
            return this;
        }
        public Computer build(){
            return new Computer(this);
        }
    }

    public String getCpu() {
        return cpu;
    }

    public String getRam() {
        return ram;
    }

    public int getUsbCount() {
        return usbCount;
    }

    public String getKeyboard() {
        return keyboard;
    }

    public String getDisplay() {
        return display;
    }

    @Override
    public String toString() {
        return new StringBuilder()
                .append(getCpu())
                .append(getRam())
                .append(getKeyboard())
                .append(getDisplay())
                .append(getUsbCount())
                .toString();
    }
}