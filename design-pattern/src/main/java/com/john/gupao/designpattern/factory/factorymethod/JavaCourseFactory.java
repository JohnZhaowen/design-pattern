package com.john.gupao.designpattern.factory.factorymethod;

import com.john.gupao.designpattern.factory.ICourse;
import com.john.gupao.designpattern.factory.JavaCourse;

public class JavaCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new JavaCourse();
    }
}
