package com.john.pattern.delegate;

public class EmployeeB implements IEmployee {
    @Override
    public void doing(String command) {
        System.out.println("我是员工B，我擅长架构");
    }
}
