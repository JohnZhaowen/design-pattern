package com.john.pattern.factory.course.factorymethod;

import com.john.pattern.factory.course.ICourse;
import com.john.pattern.factory.course.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
