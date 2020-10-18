package com.john.pattern.factory.operator.factorymethod;

import com.john.pattern.factory.operator.IOperator;
import com.john.pattern.factory.operator.SubOperator;

public class SubOperatorFactory implements IOperatorFactory {
    @Override
    public IOperator getOperator() {
        return new SubOperator();
    }
}
