package com.cmb.mode.responsibilityChain.manager;

import com.cmb.mode.responsibilityChain.leave.ILeave;

/**
 * gaozhao special annotation
 * @Package:      com.cmb.mode
 * @FileName:     GroupLeader.java
 * @ClassName:    GroupLeader
 * @Description:  小组长
 * @Author:       gaozhao
 * @CreateDate:   2020/3/9 9:51
 * @UpdateUser:   gaozhao
 * @UpdateDate:   2020/3/9 9:51
 * @UpdateRemark: 说明本次修改内容
 * @Version:      v1.0
 */
public class GroupLeader extends Handler {

    public GroupLeader() {
        //小组长处理1-3天的请假
        super(Handler.NUM_ONE, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(ILeave leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("小组长审批：同意。");
    }

}
