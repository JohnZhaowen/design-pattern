package com.john.multithread.resposibilitychain;

import java.util.concurrent.atomic.AtomicInteger;

public class ProcessorTest {

    private static AtomicInteger num = new AtomicInteger(1);

    public static void main(String[] args) {
        SaveProcessor saveProcessor = new SaveProcessor();
        PrintProcessor printProcessor = new PrintProcessor(saveProcessor);
        PreRequestProcessor preRequestProcessor = new PreRequestProcessor(printProcessor);
        preRequestProcessor.start();
        printProcessor.start();
        saveProcessor.start();

        while (true) {
            Request request = new Request("request" + num.getAndIncrement());
            SleepUtil.sleepSeconds(1);
            preRequestProcessor.process(request);
        }
    }
}
