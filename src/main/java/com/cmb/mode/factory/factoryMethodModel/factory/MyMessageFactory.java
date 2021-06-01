package com.cmb.mode.factory.factoryMethodModel.factory;

import com.cmb.mode.factory.factoryMethodModel.MyMessageEmail;
import com.cmb.mode.factory.factoryMethodModel.MyMessageOaTodo;
import com.cmb.mode.factory.factoryMethodModel.MyMessageSms;
import com.cmb.mode.factory.factoryMethodModel.factory.IMyMessageFactory;
import com.cmb.mode.factory.factoryMethodModel.project.IMyMessage;

import java.util.HashMap;
import java.util.Map;

/**
 * gaozhao special annotation
 *
 * @Package: com.cmb.mode.factory.factoryMethodModel
 * @FileName: MyMessageFactory.java
 * @ClassName: MyMessageFactory
 * @Description: 工厂方法模式_工厂实现
 * @Author: 94068
 * @CreateDate: 2021/5/30 15:56
 * @UpdateUser: 94068
 * @UpdateDate: 2021/5/30 15:56
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
public class MyMessageFactory implements IMyMessageFactory {
    @Override
    public IMyMessage createMessage(String messageType) {
        // 这里的方式是：消费者知道自己想要什么产品；若生产何种产品完全由工厂决定，则这里不应该传入控制生产的参数。
        IMyMessage myMessage;
        Map<String, Object> messageParam = new HashMap<String, Object>();
        // 根据某些条件去选择究竟创建哪一个具体的实现对象，条件可以传入的，也可以从其它途径获取。
        // sms
        if ("SMS".equals(messageType)) {
            myMessage = new MyMessageSms();
            messageParam.put("PHONENUM", "123456789");
        } else
            // OA待办
            if ("OA".equals(messageType)) {
                myMessage = new MyMessageOaTodo();
                messageParam.put("OAUSERNAME", "testUser");
            } else
                // email
                if ("EMAIL".equals(messageType)) {
                    myMessage = new MyMessageEmail();
                    messageParam.put("EMAIL", "test@test.com");
                } else
                // 默认生产email这个产品
                {
                    myMessage = new MyMessageEmail();
                    messageParam.put("EMAIL", "test@test.com");
                }
        myMessage.setMessageParam(messageParam);
        return myMessage;
    }
}

