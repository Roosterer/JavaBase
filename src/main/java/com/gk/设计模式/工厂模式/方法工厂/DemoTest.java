package com.gk.设计模式.工厂模式.方法工厂;

import com.gk.设计模式.工厂模式.简单工厂.SimpleColorFactory;

/**
 * Create By GaoKuo On 2018/8/14
 */
public class DemoTest {

    /**
     * 方法工厂：提供一个创建产品的接口，对外隐藏创建产品的过程。弥补简单工厂违反的开闭原则。
     *
     *
     * 产品接口：ColorInt
     * 产品实例：RedColorImp，BlackColorImp
     * 工厂接口：ColorFactoryInt
     * 工厂实现：RedColorFactroyImp，BlackColorFactroyImp
     *
     * 优点是：假设现在新增了一个WhiteColorImp产品，我需要对应的再创建一个WhiteColorFactoryImp实现工厂接口
     * 在使用此产品时，先new白色的工厂实现，然后创建产品。新增产品就不要修改原先的代码了，只有新增。
     * 缺点是：客户端需要知道使用具体哪个工厂。case判断移到了调用端。
     *
     * @param args
     */

    public static void main(String[] args) {

        // 客户端调用时判断需要那个工厂，然后创建对应的产品
        ColorFactoryInt factory = new RedColorFactroyImp();
        ColorInt color = factory.createColor();
        color.fun();

    }
}
