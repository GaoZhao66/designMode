package com.cmb.mode.strategy2;

public class WechatPay implements Payment {
    @Override
    public void pay(Long order, double amount) {
        System.out.println("----微信支付----");
        System.out.println("微信支付111元");
    }
}
