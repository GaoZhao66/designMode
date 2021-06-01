package com.cmb.mode.responsibilityChain.manager;

import com.cmb.mode.responsibilityChain.leave.ILeave;

/**
 * gaozhao special annotation
 * @Package:      com.cmb.mode
 * @FileName:     Manager.java
 * @ClassName:    Manager     
 * @Description:  部门经理
 * @Author:       gaozhao   
 * @CreateDate:   2020/3/9 9:53     
 * @UpdateUser:   gaozhao     
 * @UpdateDate:   2020/3/9 9:53     
 * @UpdateRemark: 说明本次修改内容    
 * @Version:      v1.0   
 */
public class Manager extends Handler {

    public Manager() {
        //部门经理处理3-7天的请假
        super(Handler.NUM_THREE, Handler.NUM_SEVEN);
    }

    @Override
    public void handleLeave(ILeave leave) {
        System.out.println(leave.getName() + "请假" + leave.getNum() + "天," + leave.getContent() + "。");
        System.out.println("部门经理审批：同意。");
    }
}
