package com.cmb.mode.responsibilityChain;

import com.cmb.mode.responsibilityChain.leave.ILeave;
import com.cmb.mode.responsibilityChain.leave.Leave;
import com.cmb.mode.responsibilityChain.manager.BigManager;
import com.cmb.mode.responsibilityChain.manager.GroupLeader;
import com.cmb.mode.responsibilityChain.manager.Handler;
import com.cmb.mode.responsibilityChain.manager.Manager;

/**
 * gaozhao special annotation
 *
 * @Package: com.cmb.mode
 * @FileName: customer.java
 * @ClassName: customer
 * @Description: 客户端-责任链模式
 * @Author: gaozhao
 * @CreateDate: 2020/3/9 9:56
 * @UpdateUser: gaozhao
 * @UpdateDate: 2020/3/9 9:56
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
public class customer {
    public static void main(String[] args) {
        //请假条一张
        ILeave leave = new Leave("小花", 5, "身体不适");

        //各位领导
        Handler groupLeader = new GroupLeader();
        Handler manager = new Manager();
        Handler bigManager = new BigManager();

        groupLeader.setNextHandler(manager);
        manager.setNextHandler(bigManager);

        groupLeader.submit(leave);
    }
}
