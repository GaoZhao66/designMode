package com.cmb.mode.factory.factoryMethodModel.project;

import com.cmb.mode.factory.factoryMethodModel.project.IMyMessage;

import java.util.Map;

/**
 * gaozhao special annotation
 *
 * @Package: com.cmb.mode.factory.factoryMethodModel
 * @FileName: MyAbstractMessage.java
 * @ClassName: MyAbstractMessage
 * @Description: 工厂方法模式_虚拟产品类
 * @Author: 94068
 * @CreateDate: 2021/5/30 15:52
 * @UpdateUser: 94068
 * @UpdateDate: 2021/5/30 15:52
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
public abstract class MyAbstractMessage implements IMyMessage {

    /**
     * 这里可以理解为生产产品所需要的原材料库。最好是个自定义的对象，这里为了不引起误解使用Map。
     */
    private Map<String, Object> messageParam;

    @Override
    public Map<String, Object> getMessageParam() {
        return messageParam;
    }

    @Override
    public void setMessageParam(Map<String, Object> messageParam) {
        this.messageParam = messageParam;
    }
}
