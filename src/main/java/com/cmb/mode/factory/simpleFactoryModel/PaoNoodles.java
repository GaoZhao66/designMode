package com.cmb.mode.factory.simpleFactoryModel;

/**
 * gaozhao special annotation
 *
 * @Package: com.cmb.mode.factory.simpleFactoryModel
 * @FileName: PaoNoodles.java
 * @ClassName: PaoNoodles
 * @Description: 泡面
 * @Author: 94068
 * @CreateDate: 2021/5/30 15:30
 * @UpdateUser: 94068
 * @UpdateDate: 2021/5/30 15:30
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
public class PaoNoodles extends INoodles {
    @Override
    public void desc() {
        System.out.println("泡面好吃 可不要贪杯");
    }
}
