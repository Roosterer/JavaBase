package com.gk.设计模式.工厂模式.抽象工厂;

import org.junit.Test;

/**
 * Create By GaoKuo On 2018/8/15
 */
public class DemoTest {


    /**
     * 菜鸟：http://www.runoob.com/design-pattern/abstract-factory-pattern.html
     * 抽象工厂
     * 可以看出来，工厂方法只是抽象工厂的一种特殊情况，即产品只有一个时的特俗情况。
     * 如果一个品牌下，有一组有关系的的产品。这个时候就是抽象工厂。
     * 使用抽象工厂扩展品牌很容易，例如多了一个李宁品牌，分别实现李宁篮球、李宁足球产品，再实现一个李宁工厂即可。
     * 但是如果需要扩展一个产品，例如多了一个羽毛球产品。则需要来一个羽毛球接口不同厂商实现，所有工厂增加创建羽毛球的实现。
     *
     * 这里演示的时最基本的。如果做到动态扩展呢，反射加配置文件的方式。
     * 这里既然用到反射了，就使用简单工厂，利用反射和配置文件实现最少修改。
     *
     */
    @Test
    public void test(){
        // 1. 抽象工厂的使用
        SportFactoryInt factory = new AdidasFactoryImp();
        BasketballInt basketball = factory.createBasketball();
        FootballInt footbasll = factory.createFootbasll();
        basketball.fun();
        footbasll.fun();
    }


    /**
     * 抽象工厂升级版本
     * 利用简单工厂，使用反射来返回不同的产品。产品分组可有配置文件读取。这样可以创建同一个分组下的多个产品。
     * 如果增加产品，再工厂中增加一个方法即可。工厂可生产多个产品。
     * 如果增加一个分组，则通过配置文件读取分组即可。通过反射动态创建分组下的产品。
     */
    @Test
    public void testUpdateFactory(){
        BasketballInt basketball = UpdateFactory.createBasketball();
        FootballInt football = UpdateFactory.createFootball();
        basketball.fun();
        football.fun();
    }
}
