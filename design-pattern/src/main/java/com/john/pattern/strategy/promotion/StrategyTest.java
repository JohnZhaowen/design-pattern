package com.john.pattern.strategy.promotion;

public class StrategyTest {

    public static void main(String[] args) {
        PromotionStrategy strategy = PromotionStrategyFactory.getInstance("coupon");
        PromotionActivity activity = new PromotionActivity(strategy);
        activity.execute();
    }
}
