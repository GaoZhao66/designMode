package com.cmb.mode.builder;

/**
 * 指挥者
 */
public class Director {
    /**
     * 指挥装机人员组装电脑
     */
    public void Construct(Builder builder) {
        builder.BuildCPU();
        builder.BuildMainboard();
        builder.BuildHD();
    }
}
