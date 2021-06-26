package com.cmb.mode.adapter.interFaceAdapter;

/**
 * @Author gaozhao
 * @Param
 * @Return
 * @Description: 基于接口的适配器模式
 */
public class Test {
    public static void main(String[] args) {
        DC5V dc5V = new Adapter(new AC220V());
        int dc = dc5V.dc5v();
        System.out.println("输入的电压为：" + new AC220V().output() + " 伏...");
        System.out.println("转换后的电压为：" + dc + " 伏...");
    }
}
