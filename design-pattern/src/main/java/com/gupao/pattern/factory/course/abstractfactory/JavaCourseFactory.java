package com.gupao.pattern.factory.course.abstractfactory;

import com.gupao.pattern.factory.course.ICourse;
import com.gupao.pattern.factory.course.JavaCourse;

/**
 * 产品族的工厂接口
 */
public class JavaCourseFactory implements ICourseFactory{

    @Override
    public ICourse createCourse() {
        return new JavaCourse();
    }

    @Override
    public INote createNote() {
        return new JavaNote();
    }

    @Override
    public IVideo createVideo() {
        return new JavaVideo();
    }
}
