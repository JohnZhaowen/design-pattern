package com.john.pattern.builder.nopattern;

public class BuilderTest {

    public static void main(String[] args) {
        AbstractHouse house = new CommonHouse();
        house.build();
    }
}
