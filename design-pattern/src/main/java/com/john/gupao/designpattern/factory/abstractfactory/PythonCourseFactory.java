package com.john.gupao.designpattern.factory.abstractfactory;

import com.john.gupao.designpattern.factory.ICourse;
import com.john.gupao.designpattern.factory.JavaCourse;
import com.john.gupao.designpattern.factory.PythonCourse;

/**
 * 产品族的工厂接口
 */
public class PythonCourseFactory implements ICourseFactory{

    @Override
    public ICourse createCourse() {
        return new PythonCourse();
    }

    @Override
    public INote createNote() {
        return new PythonNote();
    }

    @Override
    public IVideo createVideo() {
        return new PythonVideo();
    }
}
