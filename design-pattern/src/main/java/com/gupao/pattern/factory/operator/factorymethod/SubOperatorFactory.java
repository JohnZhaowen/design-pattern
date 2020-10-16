package com.gupao.pattern.factory.operator.factorymethod;

import com.gupao.pattern.factory.operator.IOperator;
import com.gupao.pattern.factory.operator.SubOperator;

public class SubOperatorFactory implements IOperatorFactory {
    @Override
    public IOperator getOperator() {
        return new SubOperator();
    }
}
