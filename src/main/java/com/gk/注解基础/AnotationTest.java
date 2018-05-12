package com.gk.注解基础;


import java.lang.reflect.Method;

public class AnotationTest {


    public static void main(String[] args) {

        // 调用被 @Deprecated 修饰的方法
        fun1();

        // 通过反射，判断字段，方法，类上是否有指定的注解，获取自定义注解的值
        AnotationTest anotationTest = new AnotationTest();
        Class<? extends AnotationTest> aClass = anotationTest.getClass();
        Method[] declaredMethods = aClass.getDeclaredMethods();
        for (int i = 0; i < declaredMethods.length; i++) {
            Method method = declaredMethods[i];
            method.setAccessible(true);
            boolean useAnotation = method.isAnnotationPresent(MyAnotation.class);
            if(useAnotation){
                MyAnotation annotation = method.getAnnotation(MyAnotation.class);
                System.out.println("#######fun is" + method.getName());
                System.out.println(annotation.name());
                System.out.println(annotation.name2());
                System.out.println(annotation.name3().length);
            }
        }


    }
    @MyAnotation(name="this is name",name3 = {"hello" , "world"})
    public static void fun(){
        System.out.println("fun is invoke");
    }

    @MyAnotation(name="this is name")
    @Deprecated
    public static void fun1(){
        System.out.println("fun is invoke");
    }


}
