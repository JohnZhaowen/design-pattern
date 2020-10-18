package com.john.pattern.singleton.hungry;

public class HungryStaticSingleton {

    private static final HungryStaticSingleton hungrySingleton;

    static {
        hungrySingleton = new HungryStaticSingleton();
    }
    private HungryStaticSingleton(){
        if(hungrySingleton != null){
            throw new RuntimeException("instance is already exist");
        }
    }

    public HungryStaticSingleton getInstance(){
        return hungrySingleton;
    }

    private Object readResolve(){
        return hungrySingleton;
    }
}
