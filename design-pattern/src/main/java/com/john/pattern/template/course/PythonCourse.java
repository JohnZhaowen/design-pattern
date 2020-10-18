package com.john.pattern.template.course;

public class PythonCourse extends NetworkCourse {

    private boolean needHomeWork;

    public PythonCourse(boolean needHomeWork){
        this.needHomeWork = needHomeWork;
    }

    @Override
    void checkHomeWork() {
        System.out.println("检查python课件");
    }

    @Override
    protected boolean needHomeWork() {
        return needHomeWork;
    }
}
