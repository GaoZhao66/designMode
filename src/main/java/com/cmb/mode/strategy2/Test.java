package com.cmb.mode.strategy2;

/**
 * @Author gaozhao
 * @Param
 * @Return
 * @Description: 测试策略模式
 */
public class Test {
    public static void main(String[] args) {
        //选择支付方式
        PayType payType = PayType.getByCode("1");
        //进行支付
        payType.get().pay(1L, 2);
    }
}
