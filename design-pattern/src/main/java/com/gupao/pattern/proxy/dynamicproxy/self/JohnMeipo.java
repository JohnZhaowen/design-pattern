package com.gupao.pattern.proxy.dynamicproxy.self;

import com.gupao.pattern.proxy.staticproxy.findlove.Person;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JohnMeipo implements JohnInvocationHandler {

    private Person target;

    public Object getInstance(Person person){
        this.target = person;
        Class<? extends Person> clazz = target.getClass();

        return JohnProxy.newProxyInstance(
                new JohnClassLoader() ,
                clazz.getInterfaces(),
                this
        );

    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("媒婆物色对象");
        return method.invoke(target, args);
    }
}
