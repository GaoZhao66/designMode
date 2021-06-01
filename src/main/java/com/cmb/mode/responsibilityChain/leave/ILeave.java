package com.cmb.mode.responsibilityChain.leave;

/**
 * gaozhao special annotation
 *
 * @Package: com.cmb.mode
 * @FileName: ILeave.java
 * @ClassName: ILeave
 * @Description: 请假条抽象
 * @Author: gaozhao
 * @CreateDate: 2020/3/9 9:42
 * @UpdateUser: gaozhao
 * @UpdateDate: 2020/3/9 9:42
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
public interface ILeave {

    /**
     * 请假人姓名
     */
    String getName();

    /**
     * 请假人姓名
     */
    int getNum();

    /**
     * 请假条内容
     */
    String getContent();

}
