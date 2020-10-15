package com.gupao.designpattern.factory.course.simplefactory;

import com.gupao.designpattern.factory.course.ICourse;

public class CourseFactory {

    public ICourse create(Class<? extends ICourse> clazz){
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
