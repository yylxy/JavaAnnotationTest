package com.example;

/**
 * 说明:注解使用类
 * 作者： 杨阳; 创建于：  2017-06-02  16:13
 */
@MyAnnotation(otherAnnotation = @OtherAnnotation("RRRRRRRR"), color = "red", value = "132",array = {4,5,6,7,8},enum1 = EnumTest.NAME2)
public class AnnotationTest {
    @Deprecated
    @MyAnnotation("456")
    public void getString() {
        System.out.println("1111111");
    }
}
