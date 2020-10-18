package com.john.pattern.proxy.staticproxy.dbroute;

import com.john.pattern.proxy.staticproxy.dbroute.proxy.OrderServiceDynamicProxy;

import java.util.Date;

public class DbRouterProxyTest {

    public static void main(String[] args) {
        Order order = new Order("1", null, new Date().getTime());
        IOrderService orderService = (IOrderService)new OrderServiceDynamicProxy().getInstance(new OrderService());
//        IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
        orderService.createOrder(order);
    }
}
