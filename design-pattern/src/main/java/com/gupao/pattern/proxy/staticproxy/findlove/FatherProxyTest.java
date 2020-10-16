package com.gupao.pattern.proxy.staticproxy.findlove;

public class FatherProxyTest {

    public static void main(String[] args) {
        Father father = new Father(new Son());
        father.findLove();
    }
}
