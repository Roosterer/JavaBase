package com.gk.设计模式.工厂模式.抽象工厂;

/**
 * Create By GaoKuo On 2018/8/15
 */
public class NickFactoryImp implements SportFactoryInt {
    @Override
    public BasketballInt createBasketball() {
        return new NickBasketballImp();
    }

    @Override
    public FootballInt createFootbasll() {
        return new NickFootballImp();
    }
}
