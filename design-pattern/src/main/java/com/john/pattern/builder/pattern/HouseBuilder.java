package com.john.pattern.builder.pattern;

public abstract class HouseBuilder {

    protected House house = new House();

    public abstract House buildBasic();

    public abstract House buildWalls();

    public abstract House roofed();

    public House build(){
        return house;
    }

}


