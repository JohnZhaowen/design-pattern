package com.john.pattern.builder.pattern;

public class CommonHouseBuilder extends HouseBuilder {

    @Override
    public House buildBasic() {
        house.setBasic("建造普通房子的地基");
        return house;
    }

    @Override
    public House buildWalls() {
        house.setWall("建造普通房子的墙体");
        return house;
    }

    @Override
    public House roofed() {
        house.setRoofed("建造普通房子的屋顶");
        return house;
    }
}


