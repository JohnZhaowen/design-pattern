package com.john.pattern.prototype;

import java.time.LocalDate;
import java.util.Arrays;

public class ClonePrototypeTest {

    public static void main(String[] args) {

/*        ShollowClonePrototype t = new ShollowClonePrototype();
        t.setName("zhangsan");
        t.setAge(12);
        t.setHobbies(Arrays.asList("pashan", "changge"));

        ShollowClonePrototype clone = (ShollowClonePrototype)t.clone();
        System.out.println(clone == t);
        */
        DeepClonePrototype src = new DeepClonePrototype();
        src.setAge(12);
        src.setName("lisi");
        src.setHobbies(Arrays.asList("pashan", "changge"));
        WorkExpience w = new WorkExpience();
        w.setCompany("shanghai");
        w.setEndTime(LocalDate.parse("2018-12-03"));
        w.setStartTime(LocalDate.parse("2020-12-03"));
        src.setWorkExpience(w);

        DeepClonePrototype clone = src.clone();
        clone.getWorkExpience().setCompany("beijing");
//        clone.getHobbies().add("tiaowu");

        System.out.println(clone == src);

    }
}
