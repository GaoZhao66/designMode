package com.cmb.mode.factory.factoryMethodModel.project;

import java.util.Map;

/**
 * gaozhao special annotation
 *
 * @Package: com.cmb.mode.factory.factoryMethodModel
 * @FileName: IMyMessage.java
 * @ClassName: IMyMessage
 * @Description: 工厂方法模式_产品接口
 * @Author: 94068
 * @CreateDate: 2021/5/30 15:51
 * @UpdateUser: 94068
 * @UpdateDate: 2021/5/30 15:51
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
public interface IMyMessage {

    /**
     * 获取消息参数
     */
    public Map<String, Object> getMessageParam();

    /**
     * 发送通知/消息
     */
    public void setMessageParam(Map<String, Object> messageParam);

    /**
     * 发送通知/消息
     */
    public void sendMesage() throws Exception;
}
