package com.gupao.pattern.proxy.staticproxy.dbroute;

import com.gupao.pattern.proxy.staticproxy.dbroute.proxy.OrderServiceStaticProxy;

import java.util.Date;

public class DbRouterProxyTest {

    public static void main(String[] args) {
        Order order = new Order("1", null, new Date().getTime());
        IOrderService orderService = new OrderServiceStaticProxy(new OrderService());
        orderService.createOrder(order);
    }
}
