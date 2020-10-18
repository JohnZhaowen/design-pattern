package com.john.pattern.observer.gper;

import java.util.Observable;
import java.util.Observer;

public class Teacher implements Observer {

    private String name;

    public Teacher(String name) {
        this.name = name;
    }

    @Override
    public void update(Observable o, Object arg) {
        GPer gPer = (GPer) o;
        Question question = (Question)arg;

        System.out.println("================");
        System.out.println(name + "老师你好，你收到了一个来自GPER生态圈的问题，请你回答，问题内容是："
         + question.getContent() + ", 提问者是：" + question.getUsername()
        );
    }
}
