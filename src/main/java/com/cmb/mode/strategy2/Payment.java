package com.cmb.mode.strategy2;

/**
 * @Author gaozhao
 * @Param
 * @Return
 * @Description: 支付接口
 */
public interface Payment {
    void pay(Long order, double amount);
}
