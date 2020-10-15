package com.gupao.designpattern.factory.course.abstractfactory;

import com.gupao.designpattern.factory.course.ICourse;

/**
 * 产品族的工厂接口
 */
public interface ICourseFactory {

    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
