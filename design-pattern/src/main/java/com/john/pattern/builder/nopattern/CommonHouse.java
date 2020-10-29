package com.john.pattern.builder.nopattern;

public class CommonHouse extends AbstractHouse {

    @Override
    public AbstractHouse buildBasic() {
        System.out.println("普通房子建造地基");
        return this;
    }

    @Override
    public AbstractHouse buildWalls() {
        System.out.println("普通房子砌墙");
        return this;
    }

    @Override
    public AbstractHouse roofed() {
        System.out.println("普通房子盖屋顶");
        return this;
    }
}
