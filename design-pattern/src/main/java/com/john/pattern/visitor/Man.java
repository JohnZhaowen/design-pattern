package com.john.pattern.visitor;

public class Man extends Person {

    private String name;

    @Override
    public void accept(Action action) {
        action.getManScore(this);
    }

    public Man(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
