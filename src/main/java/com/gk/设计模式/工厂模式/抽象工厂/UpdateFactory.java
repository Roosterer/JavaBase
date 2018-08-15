package com.gk.设计模式.工厂模式.抽象工厂;

/**
 * Create By GaoKuo On 2018/8/15
 */
public class UpdateFactory {

    private static final String factory = "Nick";   // 可以从配置文件动态加载获取

    public static BasketballInt createBasketball(){

        String className = "com.gk.设计模式.工厂模式.抽象工厂."+ factory + "BasketballImp";
        try {
            return (BasketballInt) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static FootballInt createFootball(){

        String className = "com.gk.设计模式.工厂模式.抽象工厂."+ factory + "FootballImp";
        try {
            return (FootballInt) Class.forName(className).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }



}
