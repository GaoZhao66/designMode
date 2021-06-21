package com.cmb.mode.adapter.classAdapter;

public class Test {
    /**
     * 基于类的适配器模式
     */
    public static void main(String[] args) {
        DC5V dc5V =  new Adapter();
        int dc5 = dc5V.dc5v();
        System.out.println("转换后的电压为：" + dc5 + " 伏...");
    }
}
