package com.john.pattern.factory.course.simplefactory;

import com.john.pattern.factory.course.ICourse;

public class CourseFactory {

    public ICourse create(Class<? extends ICourse> clazz){
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
