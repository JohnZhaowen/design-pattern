package com.gupao.pattern.factory.operator.factorymethod;

public class FactoryMethodFactoryTest {

    public static void main(String[] args) {
        IOperatorFactory f = new AddOperatorFactory();
        System.out.println(f.getOperator().operate(3, 8));
    }
}
