package com.john.gupao.designpattern.factory.simplefactory;

import com.john.gupao.designpattern.factory.ICourse;

public class CourseFactory {

    public ICourse create(Class<? extends ICourse> clazz){
        try {
            return clazz.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
