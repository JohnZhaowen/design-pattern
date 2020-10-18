package com.john.pattern.strategy.pay;

import java.util.HashMap;
import java.util.Map;

public class PayStrategy {

    private static Map<String, Payment> register = new HashMap<>();

    static {
        register.put("ali", new AliPay());
        register.put("wechat", new WechatPay());
        register.put("jd", new JdPay());
        register.put("union", new UnionPay());
    }

    private PayStrategy(){}

    public static Payment getInstance(String payKey){

        return register.getOrDefault(payKey, new AliPay());
    }
}
