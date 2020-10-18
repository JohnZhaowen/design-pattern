package com.john.pattern.strategy.pay;

public class PayStrategyTest {

    public static void main(String[] args) {
        Order order = new Order("1", "1001", 10);

        System.out.println(order.pay("ali"));
        System.out.println(order.pay("wechat"));
        System.out.println(order.pay("jd"));
        System.out.println(order.pay("union"));

    }
}
