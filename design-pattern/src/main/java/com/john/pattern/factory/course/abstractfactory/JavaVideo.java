package com.john.pattern.factory.course.abstractfactory;

public class JavaVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制java视频");
    }
}
