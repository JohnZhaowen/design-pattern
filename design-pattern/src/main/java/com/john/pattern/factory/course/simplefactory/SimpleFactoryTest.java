package com.john.pattern.factory.course.simplefactory;

import com.john.pattern.factory.course.JavaCourse;
import com.john.pattern.factory.course.PythonCourse;

public class SimpleFactoryTest {

    public static void main(String[] args) {

        CourseFactory f = new CourseFactory();
        f.create(JavaCourse.class).record();
        f.create(PythonCourse.class).record();
    }
}
