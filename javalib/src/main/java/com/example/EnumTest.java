package com.example;

/**
 * 说明:枚举测试
 * 作者： 杨阳; 创建于：  2017-06-02  17:31
 */
public enum EnumTest {
    NAME1("aaaaa"),NAME2("bbbbb");

    String name;

    EnumTest(String name) {
        this.name = name;
    }
}
