package com.gupao.designpattern.factory.course.simplefactory;

import com.gupao.designpattern.factory.course.JavaCourse;
import com.gupao.designpattern.factory.course.PythonCourse;

public class SimpleFactoryTest {

    public static void main(String[] args) {

        CourseFactory f = new CourseFactory();
        f.create(JavaCourse.class).record();
        f.create(PythonCourse.class).record();
    }
}
