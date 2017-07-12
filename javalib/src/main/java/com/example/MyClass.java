package com.example;

/**
 * 说明:注解的反射使用类
 * 作者： 杨阳; 创建于：  2017-06-02  16:14
 */
public class MyClass {
    public static void main(String[] arg) {
        AnnotationTest at = new AnnotationTest();
        at.getString();
        //判断注解
        if (AnnotationTest.class.isAnnotationPresent(MyAnnotation.class)) {
            //得到注解
            MyAnnotation myAnnotation = AnnotationTest.class.getAnnotation(MyAnnotation.class);
            //输出注解
            System.out.println(myAnnotation.color() + "\t\t" + myAnnotation.value());
            System.out.println(myAnnotation.array().length + "\t\t" + myAnnotation.toString());
            System.out.println(myAnnotation.enum1().name);
            System.out.println(myAnnotation.otherAnnotation().value());
        }
    }
}
