package com.gupao.designpattern.factory.operator.factorymethod;

import com.gupao.designpattern.factory.operator.AddOperator;
import com.gupao.designpattern.factory.operator.DivOperator;
import com.gupao.designpattern.factory.operator.IOperator;

public class DivOperatorFactory implements IOperatorFactory {
    @Override
    public IOperator getOperator() {
        return new DivOperator();
    }
}
