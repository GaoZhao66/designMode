package com.cmb.mode.factory.simpleFactoryModel;

/**
 * gaozhao special annotation
 *
 * @Package: com.cmb.mode.factory.simpleFactoryModel
 * @FileName: GankouNoodles.java
 * @ClassName: GankouNoodles
 * @Description: 梅干菜
 * @Author: 94068
 * @CreateDate: 2021/5/30 15:31
 * @UpdateUser: 94068
 * @UpdateDate: 2021/5/30 15:31
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
public class GankouNoodles extends INoodles {
    @Override
    public void desc() {
        System.out.println("还是家里的干扣面好吃 6块一碗");
    }
}
