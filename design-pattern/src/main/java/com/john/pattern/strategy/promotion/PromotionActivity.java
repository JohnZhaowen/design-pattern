package com.john.pattern.strategy.promotion;

/**
 * 活动规则
 */
public class PromotionActivity {

    private PromotionStrategy strategy;

    public PromotionActivity (PromotionStrategy strategy){
        this.strategy = strategy;
    }

    public void execute(){
        strategy.doPromotion();
    }

    
}
