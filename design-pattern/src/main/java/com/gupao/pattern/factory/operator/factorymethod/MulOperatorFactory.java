package com.gupao.pattern.factory.operator.factorymethod;

import com.gupao.pattern.factory.operator.IOperator;
import com.gupao.pattern.factory.operator.MulOperator;

public class MulOperatorFactory implements IOperatorFactory {
    @Override
    public IOperator getOperator() {
        return new MulOperator();
    }
}
