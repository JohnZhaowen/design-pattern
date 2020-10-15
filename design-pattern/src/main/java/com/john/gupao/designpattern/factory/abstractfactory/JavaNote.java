package com.john.gupao.designpattern.factory.abstractfactory;

public class JavaNote implements INote {
    @Override
    public void record() {
        System.out.println("编写java笔记");
    }
}
