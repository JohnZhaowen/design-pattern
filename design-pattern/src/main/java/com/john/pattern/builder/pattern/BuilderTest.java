package com.john.pattern.builder.pattern;

public class BuilderTest {

    public static void main(String[] args) {
        HouseBuilderDirector director = new HouseBuilderDirector(new CommonHouseBuilder());
        House house = director.buildHouse();
        System.out.println(house);
    }
}
