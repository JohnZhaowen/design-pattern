package com.john.pattern.builder.nopattern;

public abstract class AbstractHouse {

    public abstract AbstractHouse buildBasic();

    public abstract AbstractHouse buildWalls();

    public abstract AbstractHouse roofed();

    public AbstractHouse build(){
        buildBasic();
        buildWalls();
        roofed();
        return this;
    }

}


