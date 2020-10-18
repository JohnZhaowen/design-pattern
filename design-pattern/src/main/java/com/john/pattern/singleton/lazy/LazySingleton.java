package com.john.pattern.singleton.lazy;

import java.io.Serializable;

public class LazySingleton implements Serializable {

    private static final long serialVersionUID = 5320458560389156042L;

    private static volatile LazySingleton lazySingleton;

    private LazySingleton(){
        if(lazySingleton != null){
            throw new RuntimeException("instance is already exist");
        }
    }

    public static LazySingleton getInstance() {

        if(lazySingleton == null){
            synchronized (LazySingleton.class) {
                if(lazySingleton == null){
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }

    private Object readResolve(){
        return lazySingleton;
    }
}
