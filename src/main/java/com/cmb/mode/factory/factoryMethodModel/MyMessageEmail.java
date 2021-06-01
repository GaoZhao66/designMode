package com.cmb.mode.factory.factoryMethodModel;

import com.cmb.mode.factory.factoryMethodModel.project.MyAbstractMessage;

/**
 * gaozhao special annotation
 *
 * @Package: com.cmb.mode.factory.factoryMethodModel
 * @FileName: MyMessageEmail.java
 * @ClassName: MyMessageEmail
 * @Description: 工厂方法模式_email产品
 * @Author: 94068
 * @CreateDate: 2021/5/30 15:59
 * @UpdateUser: 94068
 * @UpdateDate: 2021/5/30 15:59
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
public class MyMessageEmail extends MyAbstractMessage {
    @Override
    public void sendMesage() throws Exception {
        // TODO Auto-generated method stub
        if (null == getMessageParam() || null == getMessageParam().get("EMAIL")
                || "".equals(getMessageParam().get("EMAIL"))) {
            throw new Exception("发送短信,需要传入EMAIL参数");// 为了简单起见异常也不自定义了
        }// 另外邮件内容，以及其他各种协议参数等等都要处理

        System.out.println("我是邮件，发送通知给" + getMessageParam().get("EMAIL"));
    }
}
