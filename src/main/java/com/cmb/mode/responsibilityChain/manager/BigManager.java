package com.cmb.mode.responsibilityChain.manager;

import com.cmb.mode.responsibilityChain.leave.ILeave;

/**
 * gaozhao special annotation
 * @Package:      com.cmb.mode
 * @FileName:     BigManager.java
 * @ClassName:    BigManager
 * @Description:  总经理
 * @Author:       gaozhao
 * @CreateDate:   2020/3/9 9:54
 * @UpdateUser:   gaozhao
 * @UpdateDate:   2020/3/9 9:54
 * @UpdateRemark: 说明本次修改内容
 * @Version:      v1.0
 */
public class BigManager extends Handler {

    public BigManager() {
        //部门经理处理7天以上的请假
        super(Handler.NUM_SEVEN);
    }

    @Override
    public void handleLeave(ILeave leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("总经理审批：同意。");
    }
}
