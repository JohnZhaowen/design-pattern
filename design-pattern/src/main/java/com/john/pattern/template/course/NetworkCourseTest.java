package com.john.pattern.template.course;

public class NetworkCourseTest {

    public static void main(String[] args) {

        JavaCourse javaCourse = new JavaCourse();
        javaCourse.createCourse();

        PythonCourse pythonCourse = new PythonCourse(false);
        pythonCourse.createCourse();
    }
}
