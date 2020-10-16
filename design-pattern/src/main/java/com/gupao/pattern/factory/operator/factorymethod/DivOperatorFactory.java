package com.gupao.pattern.factory.operator.factorymethod;

import com.gupao.pattern.factory.operator.DivOperator;
import com.gupao.pattern.factory.operator.IOperator;

public class DivOperatorFactory implements IOperatorFactory {
    @Override
    public IOperator getOperator() {
        return new DivOperator();
    }
}
