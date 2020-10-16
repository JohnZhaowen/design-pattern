package com.gupao.pattern.factory.course.factorymethod;

import com.gupao.pattern.factory.course.ICourse;
import com.gupao.pattern.factory.course.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
