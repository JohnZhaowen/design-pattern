package com.john.pattern.factory.course.factorymethod;

import com.john.pattern.factory.course.ICourse;
import com.john.pattern.factory.course.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
