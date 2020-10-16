package com.gupao.pattern.proxy.dynamicproxy.self;

import com.gupao.pattern.proxy.dynamicproxy.jdk.Girl;
import com.gupao.pattern.proxy.staticproxy.findlove.Person;

public class SelfProxyTest {

    public static void main(String[] args) throws Exception {

        Person person = (Person)new JohnMeipo().getInstance(new Girl());
        person.findLove();

    }
}
