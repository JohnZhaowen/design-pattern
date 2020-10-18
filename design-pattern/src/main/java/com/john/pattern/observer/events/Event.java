package com.john.pattern.observer.events;

import java.lang.reflect.Method;

public class Event {

    //事件源，事件是由谁发起的
    private Object source;

    //事件接收者，即事件触发后应该通知谁
    private Object target;

    //回调，即事件触发时要调用那个方法
    private Method callback;

    //事件名称，即触发的是什么事件
    private String trigger;

    //事件触发的时间
    private long time;

    public Event(Object target, Method callback) {
        this.target = target;
        this.callback = callback;
    }

    public Event() {
    }

    public Object getSource() {
        return source;
    }

    public void setSource(Object source) {
        this.source = source;
    }

    public Object getTarget() {
        return target;
    }

    public void setTarget(Object target) {
        this.target = target;
    }

    public Method getCallback() {
        return callback;
    }

    public void setCallback(Method callback) {
        this.callback = callback;
    }

    public String getTrigger() {
        return trigger;
    }

    public void setTrigger(String trigger) {
        this.trigger = trigger;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }
}
