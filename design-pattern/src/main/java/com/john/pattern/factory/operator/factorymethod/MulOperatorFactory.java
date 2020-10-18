package com.john.pattern.factory.operator.factorymethod;

import com.john.pattern.factory.operator.IOperator;
import com.john.pattern.factory.operator.MulOperator;

public class MulOperatorFactory implements IOperatorFactory {
    @Override
    public IOperator getOperator() {
        return new MulOperator();
    }
}
