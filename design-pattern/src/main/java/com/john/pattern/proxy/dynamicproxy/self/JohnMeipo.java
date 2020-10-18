package com.john.pattern.proxy.dynamicproxy.self;

import com.john.pattern.proxy.staticproxy.findlove.Person;

import java.lang.reflect.Method;

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
        System.out.println("----媒婆物色对象---");
        return method.invoke(target, args);
    }
}
