package com.john.pattern.decorator.pattern;

public class SausageDecorator extends BattercakeDecorator {


    public SausageDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected int price() {
        return super.price() + 2;
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1根香肠";
    }
}
