package com.john.pattern.adapter.power;

public class AdapterTest {

    public static void main(String[] args) {
        PowerAdapter adapter = new PowerAdapter(new AC220());
        System.out.println(adapter.outputDC5V());
    }
}
