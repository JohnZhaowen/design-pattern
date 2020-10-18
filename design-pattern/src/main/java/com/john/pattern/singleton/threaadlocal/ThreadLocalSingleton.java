package com.john.pattern.singleton.threaadlocal;

public class ThreadLocalSingleton {

    private static final ThreadLocal<ThreadLocalSingleton> instance =
            ThreadLocal.withInitial(() -> new ThreadLocalSingleton());

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance() {
        return instance.get();
    }
}
