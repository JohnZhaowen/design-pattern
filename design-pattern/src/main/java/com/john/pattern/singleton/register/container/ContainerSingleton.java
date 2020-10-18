package com.john.pattern.singleton.register.container;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ContainerSingleton {

    private ContainerSingleton(){}

    private static Map<String, Object> ioc = new ConcurrentHashMap<>();

    public static Object getBean(String beanName){
        return ioc.computeIfAbsent(beanName, b -> {
            try {
                return Class.forName(b).newInstance();

            } catch (Exception e) {
                e.printStackTrace();
            }


            return null;
        });
    }

}
