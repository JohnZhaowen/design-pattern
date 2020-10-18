package com.john.pattern.factory.operator.simplefactory;

import com.john.pattern.factory.operator.*;

public class OperatorFactory {

    IOperator get(String operator){

        IOperator p;

        switch (operator) {
            case "+" :
                p = new AddOperator();
                break;
            case "-" :
                p = new SubOperator();
                break;
            case "*" :
                p = new MulOperator();
            case "/" :
                p = new DivOperator();
                break;
            default:
                throw new RuntimeException("不支持的操作符");

        }
        return p;

    }
}
