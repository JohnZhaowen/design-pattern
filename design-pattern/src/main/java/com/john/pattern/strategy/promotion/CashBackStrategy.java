package com.john.pattern.strategy.promotion;

public class CashBackStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("返现促销");
    }
}
