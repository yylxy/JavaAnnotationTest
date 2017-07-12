package com.example;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 说明:注解创建类
 * 作者： 杨阳; 创建于：  2017-06-02  17:08
 */
@Retention(RetentionPolicy.RUNTIME)//定义注释的生命周期
@Target({ElementType.METHOD, ElementType.TYPE})//注释的类型，类型是支持方法与类。
public @interface OtherAnnotation {
    String value() default "yyyyy";

}
