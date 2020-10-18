package com.john.pattern.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {

    private static Map<String, PromotionStrategy> register = new HashMap<>();

    static {
        register.put("cashBack", new CashBackStrategy());
        register.put("groupBuy", new GroupBuyStrategy());
        register.put("coupon", new CouponStrategy());
    }

    private PromotionStrategyFactory(){
    }

    public static PromotionStrategy getInstance(String promotionKey){
        return register.getOrDefault(promotionKey, new EmptyStrategy());
    }

}
