package com.cmb.mode.factory.factoryMethodModel.factory;

import com.cmb.mode.factory.factoryMethodModel.project.IMyMessage;

/**
 * gaozhao special annotation
 *
 * @Package: com.cmb.mode.factory.factoryMethodModel
 * @FileName: IMyMessageFactory.java
 * @ClassName: IMyMessageFactory
 * @Description: 工厂方法模式_工厂接口
 * @Author: 94068
 * @CreateDate: 2021/5/30 15:49
 * @UpdateUser: 94068
 * @UpdateDate: 2021/5/30 15:49
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
public interface IMyMessageFactory {
    public IMyMessage createMessage(String messageType);
}
