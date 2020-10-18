package com.john.pattern.singleton.hungry;

public class HungrySingleton {

    private static final HungrySingleton hungrySingleton = new HungrySingleton();

    private HungrySingleton(){
        if(hungrySingleton != null){
            throw new RuntimeException("instance is already exist");
        }
    }

    public HungrySingleton getInstance(){
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }
}
