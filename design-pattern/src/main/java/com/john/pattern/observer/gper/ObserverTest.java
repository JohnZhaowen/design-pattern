package com.john.pattern.observer.gper;

public class ObserverTest {

    public static void main(String[] args) {

        GPer gPer = GPer.getInstance();
        Teacher tom = new Teacher("Tom");
        Teacher mic = new Teacher("Mic");

        gPer.addObserver(tom);
        gPer.addObserver(mic);
        gPer.publishQuestion(new Question("ZHANGSAN", "设计模式是啥？"));
    }
}
