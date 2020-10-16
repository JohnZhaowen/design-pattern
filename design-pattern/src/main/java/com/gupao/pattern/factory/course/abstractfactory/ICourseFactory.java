package com.gupao.pattern.factory.course.abstractfactory;

import com.gupao.pattern.factory.course.ICourse;

/**
 * 产品族的工厂接口
 */
public interface ICourseFactory {

    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
