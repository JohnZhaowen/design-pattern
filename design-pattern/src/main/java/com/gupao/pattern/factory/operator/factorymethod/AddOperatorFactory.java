package com.gupao.pattern.factory.operator.factorymethod;

import com.gupao.pattern.factory.operator.AddOperator;
import com.gupao.pattern.factory.operator.IOperator;

public class AddOperatorFactory implements IOperatorFactory {
    @Override
    public IOperator getOperator() {
        return new AddOperator();
    }
}
