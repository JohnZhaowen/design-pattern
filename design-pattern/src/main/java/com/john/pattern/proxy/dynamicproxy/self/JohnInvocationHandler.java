package com.john.pattern.proxy.dynamicproxy.self;

import java.lang.reflect.Method;

public interface JohnInvocationHandler {

    public Object invoke(Object proxy, Method method, Object[] args)
            throws Throwable;
}
