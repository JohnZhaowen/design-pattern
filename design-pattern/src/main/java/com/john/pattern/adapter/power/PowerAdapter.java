package com.john.pattern.adapter.power;

public class PowerAdapter implements DC5 {

    private AC220 ac220;

    public PowerAdapter(AC220 ac220) {
        this.ac220 = ac220;
    }

    @Override
    public int outputDC5V() {
        int in = ac220.outputAC220V();
        int out = in / 44;
        System.out.println("使用适配器将交流电220V转换为直流电5V");
        return out;
    }
}
