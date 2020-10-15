package com.john.gupao.designpattern.factory.abstractfactory;

public class PythonVideo implements IVideo {
    @Override
    public void record() {
        System.out.println("录制Python视频");
    }
}
