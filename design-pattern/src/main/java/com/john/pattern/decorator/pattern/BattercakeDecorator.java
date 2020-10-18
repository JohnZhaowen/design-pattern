package com.john.pattern.decorator.pattern;

public abstract class BattercakeDecorator extends Battercake {

    private Battercake battercake;

    public BattercakeDecorator(Battercake battercake) {
        this.battercake = battercake;
    }

    protected int price(){
        return this.battercake.price();
    }

    protected String getMsg() {
        return this.battercake.getMsg();
    }

}
