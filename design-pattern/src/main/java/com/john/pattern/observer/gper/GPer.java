package com.john.pattern.observer.gper;

import java.util.Observable;

public class GPer extends Observable {

    private String name = "GPer生态圈";

    private static final GPer gPer = new GPer();

    private GPer(){
        if(gPer != null){
            throw new RuntimeException("instance is already exist");
        }
    }


    public static GPer getInstance() {
        return gPer;
    }

    private Object readResolve(){
        return gPer;
    }

    public String getName() {
        return name;
    }

    public void publishQuestion(Question question){
        System.out.println(question);
        setChanged();
        notifyObservers(question);
    }
}
