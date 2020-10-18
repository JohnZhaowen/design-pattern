package com.john.pattern.decorator.pattern;

public class EggDecorator extends BattercakeDecorator {


    public EggDecorator(Battercake battercake) {
        super(battercake);
    }

    @Override
    protected int price() {
        return super.price() + 1;
    }

    @Override
    protected String getMsg() {
        return super.getMsg() + "+1个鸡蛋";
    }
}
