package com.cmb.mode.factory.simpleFactoryModel;

/**
 * gaozhao special annotation
 *
 * @Package: com.cmb.mode.factory.simpleFactoryModel
 * @FileName: SimpleNoodlesFactory.java
 * @ClassName: SimpleNoodlesFactory
 * @Description: 一句话描述该类的功能
 * @Author: 94068
 * @CreateDate: 2021/5/30 15:32
 * @UpdateUser: 94068
 * @UpdateDate: 2021/5/30 15:32
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
public class SimpleNoodlesFactory {

    public static final int TYPE_LZ = 1;//兰州拉面
    public static final int TYPE_PM = 2;//泡面
    public static final int TYPE_GK = 3;//干扣面

    public static INoodles createNoodles(int type) {
        switch (type) {
            case TYPE_LZ:
                return new LzNoodles();
            case TYPE_PM:
                return new PaoNoodles();
            case TYPE_GK:
            default:
                return new GankouNoodles();
        }
    }

    /**
     * 简单工厂模式
     */
    public static void main(String[] args) {
        INoodles noodles = SimpleNoodlesFactory.createNoodles(SimpleNoodlesFactory.TYPE_GK);
        noodles.desc();
    }
}
