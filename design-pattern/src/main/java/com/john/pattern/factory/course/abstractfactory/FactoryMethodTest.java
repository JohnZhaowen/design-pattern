package com.john.pattern.factory.course.abstractfactory;

public class FactoryMethodTest {
    public static void main(String[] args) {

        ICourseFactory javaFactory = new JavaCourseFactory();
        javaFactory.createCourse().record();
        javaFactory.createNote().record();
        javaFactory.createVideo().record();

        ICourseFactory pythonFactory = new PythonCourseFactory();
        pythonFactory.createCourse().record();
        pythonFactory.createNote().record();
        pythonFactory.createVideo().record();

    }
}
