package com.john.pattern.proxy.staticproxy.dbroute;

public class OrderDao {

    public int insert(Order order){
        System.out.println("OrderDao创建order成功");
        return 1;
    }
}
