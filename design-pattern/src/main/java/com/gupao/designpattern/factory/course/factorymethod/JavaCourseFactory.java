package com.gupao.designpattern.factory.course.factorymethod;

import com.gupao.designpattern.factory.course.ICourse;
import com.gupao.designpattern.factory.course.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
