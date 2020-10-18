package com.john.pattern.factory.operator;

public class DivOperator implements IOperator {
    @Override
    public double operate(double a, double b) {
        if(b == 0d){
            throw new RuntimeException("除数不能为0");
        }
        return a / b;
    }
}
