package com.john.pattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class ArrayListCloneTest {

    public static void main(String[] args) {

        ArrayList<String> src = new ArrayList<>();
        src.add("a");
        src.add("b");
        src.add("c");

        ArrayList<String> clone = (ArrayList<String>)src.clone();
        clone.set(0, "a1");
        clone.add("e");

        System.out.println(src == clone);


    }
}
