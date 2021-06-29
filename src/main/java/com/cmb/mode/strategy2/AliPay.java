package com.cmb.mode.strategy2;

/**
 * @Author gaozhao
 * @Param
 * @Return
 * @Description: 支付宝
 */
public class AliPay implements Payment {
    @Override
    public void pay(Long order, double amount) {
        System.out.println("----支付宝支付----");
        System.out.println("支付宝支付111元");
    }
}
