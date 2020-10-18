package com.john.pattern.delegate;

public class EmployeeA implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工A，我擅长加密");
    }
}
