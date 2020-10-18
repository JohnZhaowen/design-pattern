package com.john.pattern.strategy.promotion;

public class GroupBuyStrategy implements PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("拼团，满20人，全体人员享受团购价格");
    }
}
