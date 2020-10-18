package com.john.pattern.factory.operator.factorymethod;

import com.john.pattern.factory.operator.DivOperator;
import com.john.pattern.factory.operator.IOperator;

public class DivOperatorFactory implements IOperatorFactory {
    @Override
    public IOperator getOperator() {
        return new DivOperator();
    }
}
