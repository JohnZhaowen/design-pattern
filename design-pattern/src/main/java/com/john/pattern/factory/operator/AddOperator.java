package com.john.pattern.factory.operator;

public class AddOperator implements IOperator {
    @Override
    public double operate(double a, double b) {
        return a + b;
    }
}
