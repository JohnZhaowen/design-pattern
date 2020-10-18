package com.john.pattern.factory.course.abstractfactory;

import com.john.pattern.factory.course.ICourse;

/**
 * 产品族的工厂接口
 */
public interface ICourseFactory {

    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
