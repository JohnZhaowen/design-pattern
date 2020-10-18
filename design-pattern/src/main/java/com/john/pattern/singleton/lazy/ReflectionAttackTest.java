package com.john.pattern.singleton.lazy;

import java.lang.reflect.Constructor;

/**
 * 构造器反射攻击
 */
public class ReflectionAttackTest {

    public static void main(String[] args) throws Exception {
        Class<LazyInnerClassSingleton> clazz = LazyInnerClassSingleton.class;
        Constructor<LazyInnerClassSingleton> constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);
        LazyInnerClassSingleton singleton1 = constructor.newInstance();
        LazyInnerClassSingleton singleton2 = constructor.newInstance();
        System.out.println(singleton1 == singleton2);
    }
}
