package com.john.pattern.visitor;

import java.util.LinkedList;
import java.util.List;

public class ObjectStructure {

    private List<Person> persons = new LinkedList<>();

    public void attach(Person p){
        persons.add(p);
    }

    public void detach(Person p){
        persons.remove(p);
    }

    public void display(Action action){
        persons.stream().forEach(p -> p.accept(action));
    }
}
