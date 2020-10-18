package com.john.pattern.singleton.lazy;

public class LazySingletonTest {

    public static void main(String[] args) {

        LazyInnerClassSingleton singleton = LazyInnerClassSingleton.getInstance();
        LazyInnerClassSingleton singleton2 = LazyInnerClassSingleton.getInstance();
        System.out.println(singleton == singleton2);

    }
}
