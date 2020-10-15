package com.john.gupao.designpattern.factory.abstractfactory;

import com.john.gupao.designpattern.factory.ICourse;
import com.john.gupao.designpattern.factory.JavaCourse;

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
