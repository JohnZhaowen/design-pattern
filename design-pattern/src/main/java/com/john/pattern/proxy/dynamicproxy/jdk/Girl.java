package com.john.pattern.proxy.dynamicproxy.jdk;

import com.john.pattern.proxy.staticproxy.findlove.Person;

public class Girl implements Person {
    @Override
    public void findLove() {
        System.out.println("高富帅");
        System.out.println("身高180cm");
        System.out.println("6块腹肌");
    }
}
