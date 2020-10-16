package com.gupao.pattern.factory.course.factorymethod;

import com.gupao.pattern.factory.course.ICourse;
import com.gupao.pattern.factory.course.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
