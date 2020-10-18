package com.john.pattern.decorator.pattern;

public abstract class Battercake {

    protected abstract int price();

    protected abstract String getMsg();

    public String toString(){
        return "[价格： " + price() + ", 名称： " + getMsg() + "].";
    }
}
