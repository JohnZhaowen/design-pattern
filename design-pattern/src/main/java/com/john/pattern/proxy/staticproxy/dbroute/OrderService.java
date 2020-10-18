package com.john.pattern.proxy.staticproxy.dbroute;

public class OrderService implements IOrderService{

    private OrderDao orderDao;

    public OrderService (){
        this.orderDao = new OrderDao();
    }

    @Override
    public int createOrder(Order order) {
        System.out.println("OrderServie调用OrderDao创建订单");
        return orderDao.insert(order);
    }
}
