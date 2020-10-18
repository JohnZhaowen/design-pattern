package com.john.pattern.decorator.pattern;

public class BaseBattercake extends Battercake {

    protected int price(){
        return 5;
    }

    protected String getMsg(){

        return "煎饼";
    }

}
