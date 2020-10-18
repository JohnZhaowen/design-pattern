package com.john.pattern.proxy.staticproxy.dbroute;

public class Order {

    private String id;

    private Object orderInfo;

    private Long createTIme;

    public Order(String id, Object orderInfo, Long createTIme) {
        this.id = id;
        this.orderInfo = orderInfo;
        this.createTIme = createTIme;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }

    public Long getCreateTIme() {
        return createTIme;
    }

    public void setCreateTIme(Long createTIme) {
        this.createTIme = createTIme;
    }
}
