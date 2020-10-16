package com.gupao.pattern.factory.operator.simplefactory;

public class SimpleFactoryTest {

    public static void main(String[] args) {
        OperatorFactory factory = new OperatorFactory();
        System.out.println(factory.get("/").operate(2, 0));
    }
}
