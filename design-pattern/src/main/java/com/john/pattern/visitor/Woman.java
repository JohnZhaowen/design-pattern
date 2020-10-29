package com.john.pattern.visitor;

public class Woman extends Person {

    private String name;

    @Override
    public void accept(Action action) {
        action.getWomanScore(this);
    }

    public Woman(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
