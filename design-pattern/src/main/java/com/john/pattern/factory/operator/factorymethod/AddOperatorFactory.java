package com.john.pattern.factory.operator.factorymethod;

import com.john.pattern.factory.operator.AddOperator;
import com.john.pattern.factory.operator.IOperator;

public class AddOperatorFactory implements IOperatorFactory {
    @Override
    public IOperator getOperator() {
        return new AddOperator();
    }
}
