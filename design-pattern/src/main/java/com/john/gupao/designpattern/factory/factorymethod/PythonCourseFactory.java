package com.john.gupao.designpattern.factory.factorymethod;

import com.john.gupao.designpattern.factory.ICourse;
import com.john.gupao.designpattern.factory.JavaCourse;
import com.john.gupao.designpattern.factory.PythonCourse;

public class PythonCourseFactory implements ICourseFactory {

    @Override
    public ICourse create() {
        return new PythonCourse();
    }
}
