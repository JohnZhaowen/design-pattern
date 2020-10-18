package com.john.pattern.decorator.pattern;

public class DecoratorTest {

    public static void main(String[] args) {

        Battercake battercake = new BaseBattercake();
        battercake = new EggDecorator(battercake);
        battercake = new EggDecorator(battercake);
        battercake = new SausageDecorator(battercake);

        System.out.println(battercake);
    }
}
