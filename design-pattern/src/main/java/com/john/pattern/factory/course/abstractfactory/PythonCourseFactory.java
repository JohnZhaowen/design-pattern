package com.john.pattern.factory.course.abstractfactory;

import com.john.pattern.factory.course.ICourse;
import com.john.pattern.factory.course.PythonCourse;

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
