package com.gupao.designpattern.factory.operator.factorymethod;

import com.gupao.designpattern.factory.operator.AddOperator;
import com.gupao.designpattern.factory.operator.IOperator;

public class AddOperatorFactory implements IOperatorFactory {
    @Override
    public IOperator getOperator() {
        return new AddOperator();
    }
}
