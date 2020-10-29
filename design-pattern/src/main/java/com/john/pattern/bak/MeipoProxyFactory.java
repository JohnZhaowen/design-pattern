package com.john.pattern.bak;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MeipoProxyFactory implements InvocationHandler {

    private Object target;

    public MeipoProxyFactory(Object target) {
        this.target = target;
    }

    public Object getInstance(){
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this
                );
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        System.out.println("dynamic proxy before...");

        Object result = method.invoke(target, args);

        System.out.println("dynamic proxy after...");


        return result;
    }
}
