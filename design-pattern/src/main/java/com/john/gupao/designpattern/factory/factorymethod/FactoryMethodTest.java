package com.john.gupao.designpattern.factory.factorymethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.create().record();
    }
}
