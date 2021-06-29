package com.cmb.mode.strategy2;

public enum PayType {
    //支付宝        AliPay 是实现类
    ALI_PAY("1", new AliPay()),
    //微信
    WECHAT_PAY("2", new WechatPay());

    //支付类型
    private String payType;
    // 这是一个接口
    private Payment payment;

    PayType(String payType, Payment payment) {
        this.payment = payment;
        this.payType = payType;
    }

    //通过get方法获取支付方式
    public Payment get() {
        return this.payment;
    }

    public static PayType getByCode(String payType) {
        for (PayType e : PayType.values()) {
            if (e.payType.equals(payType)) {
                return e;
            }
        }
        return null;
    }
}
