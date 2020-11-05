package com.john.multithread.resposibilitychain;

import java.util.concurrent.LinkedBlockingQueue;

public class SaveProcessor extends Thread implements IRequestProcessor {

    private LinkedBlockingQueue<Request> requests = new LinkedBlockingQueue<>();

    private IRequestProcessor nextProcessor;

    private volatile boolean isFinished = false;

    public SaveProcessor() {
    }

    public SaveProcessor(IRequestProcessor nextProcessor) {
        this.nextProcessor = nextProcessor;
    }

    public void shutdown(){
        isFinished = true;
    }

    @Override
    public void process(Request request) {
        requests.add(request);
    }

    private void doProcess(Request request){
        SleepUtil.sleepSeconds(2);
        System.out.println("SaveProcessor: " + request);
    }

    @Override
    public void run() {
        while (!isFinished) {
            try {
                Request request = requests.take();
                doProcess(request);
//                nextProcessor.process(request);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
