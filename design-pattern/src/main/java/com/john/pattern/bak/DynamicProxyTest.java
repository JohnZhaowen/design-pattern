package com.john.pattern.bak;

public class DynamicProxyTest {

    public static void main(String[] args) {

        MeipoImpl meipo = new MeipoImpl();
        MeipoProxyFactory f = new MeipoProxyFactory(meipo);
        Meipo instance = (Meipo)f.getInstance();

        instance.findLove();
        System.out.println("-------------------");
        instance.marry("zhangsan");
    }
}
