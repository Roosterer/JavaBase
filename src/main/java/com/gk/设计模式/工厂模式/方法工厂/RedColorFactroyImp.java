package com.gk.设计模式.工厂模式.方法工厂;

/**
 * Create By GaoKuo On 2018/8/14
 */
public class RedColorFactroyImp implements ColorFactoryInt {
    @Override
    public ColorInt createColor() {
        return new RedColorImp();
    }
}
