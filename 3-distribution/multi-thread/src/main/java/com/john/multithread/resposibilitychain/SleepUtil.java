package com.john.multithread.resposibilitychain;

import java.util.concurrent.TimeUnit;

public class SleepUtil {

    public static void sleepSeconds(int seconds){
        try {
            TimeUnit.SECONDS.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
