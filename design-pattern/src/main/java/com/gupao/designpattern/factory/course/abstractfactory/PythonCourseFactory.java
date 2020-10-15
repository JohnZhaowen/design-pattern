package com.gupao.designpattern.factory.course.abstractfactory;

import com.gupao.designpattern.factory.course.ICourse;
import com.gupao.designpattern.factory.course.PythonCourse;

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
