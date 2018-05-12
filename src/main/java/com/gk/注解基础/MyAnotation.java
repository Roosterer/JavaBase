package com.gk.注解基础;

import java.lang.annotation.*;

/**
 * 给自定义注解类添加注解（这个注解叫元注解，jdk定义的原始注解）
 */
//@Deprecated //使用此注解的类、属性、方法会被编译器识别标注为过时不推荐（IDE会在类、属性、方法上标记一条横杠）
@SuppressWarnings("deprecated") //阻止提醒，例如在一个方法上使用了@Deprecated，条用此方法会标记横杠，再加上此注解可以解除提醒
@Documented //它的作用是能够将注解中的元素包含到 Javadoc 中去
@Inherited  //可继承的，此注解注解了MyAnotation这个注解类，A类如果使用了MyAnotation，B类继承A类也会将MyAnotation继承过去，即B类上也有MyAnotation注解
@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})   //限制MyAnotation注解可以使用的范围，类，方法，字段，参数...
@Retention(RetentionPolicy.RUNTIME) //注解保留的时期，source，class，runtime，使用source，代码编译后注解便不存在了

/**
 * 定义自己的注解
 */
public @interface MyAnotation {
    //在注解中定义属性时它的类型必须是 8 种基本数据类型外加 类、接口、注解及它们的数组
    String name();
    String name2() default "is name2";
    String[] name3() default {};
}
