package com.john.pattern.strategy.pay;

public class JdPay extends Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    public double queryBalance(String uid) {
        return 500;
    }
}
