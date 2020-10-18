package com.john.pattern.prototype;

import java.util.List;

/**
 * 浅拷贝，List用的是相同的引用
 */
public class ShollowClonePrototype implements Cloneable {

    private int age;

    private String name;

    private List<String> hobbies;

    @Override
    protected ShollowClonePrototype clone() {

        ShollowClonePrototype a = new ShollowClonePrototype();
        a.setAge(this.age);
        a.setHobbies(this.hobbies);
        a.setName(this.name);

        return a;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }
}
