package com.john.pattern.decorator.nopattern;

public class BattercakeWithEgg extends Battercake {

    @Override
    protected int price(){
        return super.price() + 1;
    }

    @Override
    protected String getMsg(){

        return super.getMsg() + "+一个鸡蛋";
    }
}
