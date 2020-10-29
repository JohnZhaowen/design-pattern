package com.john.pattern.bridge;

public class BridgeTest {

    public static void main(String[] args) {

        Phone phone = new FoldedPhone(new Vivo());

        phone.open();
        phone.call();
        phone.close();
    }
}
