package com.cmb.mode.factory.simpleFactoryModel;

/**
 * gaozhao special annotation
 *
 * @Package: com.cmb.mode.factory.simpleFactoryModel
 * @FileName: LzNoodles.java
 * @ClassName: LzNoodles
 * @Description: 兰州牛肉拉面
 * @Author: 94068
 * @CreateDate: 2021/5/30 15:28
 * @UpdateUser: 94068
 * @UpdateDate: 2021/5/30 15:28
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
public class LzNoodles extends INoodles {
    @Override
    public void desc() {
        System.out.println("兰州拉面 上海的好贵 家里才5 6块钱一碗");
    }
}
