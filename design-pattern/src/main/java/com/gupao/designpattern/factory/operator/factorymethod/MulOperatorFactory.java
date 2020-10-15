package com.gupao.designpattern.factory.operator.factorymethod;

import com.gupao.designpattern.factory.operator.AddOperator;
import com.gupao.designpattern.factory.operator.IOperator;
import com.gupao.designpattern.factory.operator.MulOperator;

public class MulOperatorFactory implements IOperatorFactory {
    @Override
    public IOperator getOperator() {
        return new MulOperator();
    }
}
