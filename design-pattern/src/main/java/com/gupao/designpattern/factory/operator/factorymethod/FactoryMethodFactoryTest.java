package com.gupao.designpattern.factory.operator.factorymethod;

import com.gupao.designpattern.factory.operator.IOperator;

public class FactoryMethodFactoryTest {

    public static void main(String[] args) {
        IOperatorFactory f = new AddOperatorFactory();
        System.out.println(f.getOperator().operate(3, 8));
    }
}
