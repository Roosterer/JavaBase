package com.gk.设计模式.工厂模式.简单工厂;

/**
 * Create By GaoKuo On 2018/8/14
 */
public class DemoTest {

    /**
     * 简单工厂：工厂类对外提供一个创建产品的接口，对外隐藏创建产品的过程。
     * 创建型设计模式，缺点是新增产品时SimpleColorFactory的创建产品的接口方法需要修改（违反了设计模式的，开闭原则）
     * 不过可以通过反射的方式来弥补。
     *
     *
     * 产品接口：ColorInt
     * 产品实例：RedColorImp，BlackColorImp
     * 工厂类：SimpleColorFactory
     *
     * @param args
     */

    public static void main(String[] args) {

        ColorInt color = SimpleColorFactory.getColor("red");
        color.fun();
        ColorInt color2 = SimpleColorFactory.getColor("black");
        color2.fun();

    }
}
