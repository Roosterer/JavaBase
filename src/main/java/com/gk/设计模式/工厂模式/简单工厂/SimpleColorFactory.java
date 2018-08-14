package com.gk.设计模式.工厂模式.简单工厂;

/**
 * Create By GaoKuo On 2018/8/14
 */
public class SimpleColorFactory {

    public static ColorInt getColor(String color) {

        if (color == null) {
            return null;
        }
        switch (color) {
            case "red":
                return new RedColorImp();
            case "black":
                return new BlackColorImp();
            default:
                return null;
        }
    }

}
