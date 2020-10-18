package com.john.pattern.decorator.nopattern;

public class BattercakeWithEggAndSausage extends BattercakeWithEgg {

    @Override
    protected int price(){
        return super.price() + 2;
    }

    @Override
    protected String getMsg(){

        return super.getMsg() + "+一个香肠";
    }
}
