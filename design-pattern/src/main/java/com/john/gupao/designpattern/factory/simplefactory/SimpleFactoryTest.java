package com.john.gupao.designpattern.factory.simplefactory;

import com.john.gupao.designpattern.factory.JavaCourse;
import com.john.gupao.designpattern.factory.PythonCourse;

public class SimpleFactoryTest {

    public static void main(String[] args) {

        CourseFactory f = new CourseFactory();
        f.create(JavaCourse.class).record();
        f.create(PythonCourse.class).record();
    }
}
