package com.john.multithread;

public class ThreadTest {

    public static void main(String[] args) {
        new Thread(() -> System.out.println("lalala")).start();
    }
}
