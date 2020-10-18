package com.john.pattern.strategy.promotion;

public class CouponStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，优惠券当现金使用");
    }
}
