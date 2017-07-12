package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 说明:注解创建类
 * 作者： 杨阳; 创建于：  2017-06-02  16:10
 */
@Retention(RetentionPolicy.RUNTIME)//定义注释的生命周期
@Target({ElementType.METHOD, ElementType.TYPE})//注释的类型，类型是支持方法与类。
public @interface MyAnnotation {
    String color() default "blue";//设置的默认值

    String value();

    int[] array() default {1, 2, 3,};//返回数组类型

    EnumTest enum1() default EnumTest.NAME1;//返回枚举

    OtherAnnotation otherAnnotation() default @OtherAnnotation("hhhhhHHHH");//返回注解
}
