package com.john.pattern.singleton.register.enums;

public class EnumSingleTest {

    public static void main(String[] args) {

        EnumSingleton singleton1 = EnumSingleton.getInstance();
        EnumSingleton singleton2 = EnumSingleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}
