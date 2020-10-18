package com.john.pattern.decorator.nopattern;

public class Battercake {

    protected int price(){
        return 5;
    }

    protected String getMsg(){

        return "煎饼";
    }

    public String toString(){
        return "[价格： " + price() + ", 名称： " + getMsg() + "].";
    }
}
