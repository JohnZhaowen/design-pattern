package com.john.pattern.observer.events;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class EventLisenter {

    protected Map<String, Event> events = new HashMap<>();

    public void addLisenter(String eventType, Object target) throws NoSuchMethodException {

        this.addLisenter(eventType, target, target.getClass().getMethod("on" + toUpperFirstCase(eventType), Event.class));
    }

    public void addLisenter(String eventType, Object target, Method callback) {
        events.put(eventType, new Event(target, callback));
    }

    private void trigger(Event event) {
        try {
            event.setSource(this);
            event.setTime(System.currentTimeMillis());
            event.getCallback().invoke(event.getTarget(), event);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void trigger(String trigger) {
        if(!events.containsKey(trigger)){
            return;
        }
        Event event = events.get(trigger);
        event.setTrigger(trigger);
        trigger(event);
    }

    private String toUpperFirstCase(String str) {

        char[] chars = str.toCharArray();
        chars[0] -= 32;
        return String.valueOf(chars);
    }

}
