package com.john.pattern.bak;

public class MeipoImpl implements Meipo {
    @Override
    public void findLove() {
        System.out.println("通过媒婆寻找对象");
    }

    @Override
    public void marry(String duixiang) {
        System.out.println("通过媒婆和" + duixiang + "进行结婚");
    }
}
