package com.john.pattern.visitor;

public class Fail extends Action {
    @Override
    public void getManScore(Man man) {
        System.out.println("男歌手 '" + man.getName() + "' 评分未通过");
    }

    @Override
    public void getWomanScore(Woman woman) {
        System.out.println("女歌手 '" + woman.getName() + "' 评分未通过");
    }
}
