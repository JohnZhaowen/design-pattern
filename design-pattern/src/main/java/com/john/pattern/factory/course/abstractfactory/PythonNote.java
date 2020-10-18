package com.john.pattern.factory.course.abstractfactory;

public class PythonNote implements INote {
    @Override
    public void record() {
        System.out.println("编写python笔记");
    }
}
