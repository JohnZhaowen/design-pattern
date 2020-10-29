package com.john.pattern.builder.pattern;

public class HighHouseBuilder extends HouseBuilder {

    @Override
    public House buildBasic() {
        house.setBasic("建造高层房子的地基");
        return house;
    }

    @Override
    public House buildWalls() {
        house.setWall("建造高层房子的墙体");
        return house;
    }

    @Override
    public House roofed() {
        house.setRoofed("建造高层房子的屋顶");
        return house;
    }
}


