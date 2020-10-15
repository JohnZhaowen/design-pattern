package com.john.gupao.designpattern.factory.abstractfactory;

import com.john.gupao.designpattern.factory.ICourse;

/**
 * 产品族的工厂接口
 */
public interface ICourseFactory {

    ICourse createCourse();

    INote createNote();

    IVideo createVideo();
}
