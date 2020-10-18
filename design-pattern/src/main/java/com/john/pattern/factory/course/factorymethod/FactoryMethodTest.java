package com.john.pattern.factory.course.factorymethod;

public class FactoryMethodTest {

    public static void main(String[] args) {
        ICourseFactory factory = new JavaCourseFactory();
        factory.create().record();
    }
}
