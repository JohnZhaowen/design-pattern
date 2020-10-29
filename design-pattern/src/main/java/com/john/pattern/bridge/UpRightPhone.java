package com.john.pattern.bridge;

public class UpRightPhone extends Phone{

    public UpRightPhone(Brand brand, Brand brand1) {
        super(brand);
    }

    public void open() {
        super.open();
        System.out.println("直立手机");
    }

    public void close() {
        super.close();
        System.out.println("直立手机");
    }

    public void call() {
        super.call();
        System.out.println("直立手机");
    }

}
