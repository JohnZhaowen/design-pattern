package com.john.pattern.builder.pattern;

public class HouseBuilderDirector {

    private HouseBuilder builder;

    public HouseBuilderDirector(HouseBuilder builder) {
        this.builder = builder;
    }

    public House buildHouse(){
        builder.buildBasic();
        builder.buildWalls();
        builder.roofed();
        return builder.build();
    }
}
