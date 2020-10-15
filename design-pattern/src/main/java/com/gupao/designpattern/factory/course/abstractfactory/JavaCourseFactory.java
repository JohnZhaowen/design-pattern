package com.gupao.designpattern.factory.course.abstractfactory;

import com.gupao.designpattern.factory.course.ICourse;
import com.gupao.designpattern.factory.course.JavaCourse;

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
