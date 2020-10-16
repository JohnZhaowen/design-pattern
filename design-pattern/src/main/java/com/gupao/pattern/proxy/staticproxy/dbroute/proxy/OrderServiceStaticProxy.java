package com.gupao.pattern.proxy.staticproxy.dbroute.proxy;

import com.gupao.pattern.proxy.staticproxy.dbroute.IOrderService;
import com.gupao.pattern.proxy.staticproxy.dbroute.Order;
import com.gupao.pattern.proxy.staticproxy.dbroute.db.DynamicDataSourceEntity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class OrderServiceStaticProxy implements IOrderService {

    private SimpleDateFormat yearFormat = new SimpleDateFormat("yyyy");

    private IOrderService orderService;

    public  OrderServiceStaticProxy(IOrderService orderService){

        this.orderService = orderService;
    }

    @Override
    public int createOrder(Order order) {

        Integer router = Integer.valueOf(yearFormat.format(new Date(order.getCreateTIme())));
        System.out.println("静态代理类动态分配到库[DB_" + router + "]数据源处理数据");

        DynamicDataSourceEntity.set(router);
        orderService.createOrder(order);
        DynamicDataSourceEntity.restore();

        return 1;
    }
}
