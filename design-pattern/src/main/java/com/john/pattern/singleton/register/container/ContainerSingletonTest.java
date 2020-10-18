package com.john.pattern.singleton.register.container;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ContainerSingletonTest {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(50);
        for(int i = 0; i < 100; i++){
            executorService.submit(() -> {
                User u = (User)ContainerSingleton.getBean("com.gupao.pattern.singleton.register.container.User");
                System.out.println(u);
            });
        }
    }
}
