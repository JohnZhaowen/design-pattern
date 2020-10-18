package com.john.pattern.singleton.lazy;

public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        //防止反射攻击
        if(LazyHoler.LAZY != null){
            throw new RuntimeException("instance is already exist");
        }
    }

    public static final LazyInnerClassSingleton getInstance() {
        return LazyHoler.LAZY;
    }

    private static class LazyHoler{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

    private Object readResolve(){
        return LazyHoler.LAZY;
    }
}
