package com.john.pattern.visitor;

public class Success extends Action {
    @Override
    public void getManScore(Man man) {
        System.out.println("男歌手评分通过");
    }

    @Override
    public void getWomanScore(Woman woman) {
        System.out.println("女歌手评分通过");
    }
}
