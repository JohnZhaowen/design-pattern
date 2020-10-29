package com.john.pattern.builder.nopattern;

public class HighBuilding extends AbstractHouse {

    @Override
    public AbstractHouse buildBasic() {
        System.out.println("高层建筑建造地基");
        return this;
    }

    @Override
    public AbstractHouse buildWalls() {
        System.out.println("高层建筑砌墙");
        return this;
    }

    @Override
    public AbstractHouse roofed() {
        System.out.println("高层建筑盖屋顶");
        return this;
    }
}
