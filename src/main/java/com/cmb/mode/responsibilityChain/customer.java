package com.cmb.mode.responsibilityChain;

import com.cmb.mode.responsibilityChain.leave.ILeave;
import com.cmb.mode.responsibilityChain.leave.Leave;
import com.cmb.mode.responsibilityChain.manager.BigManager;
import com.cmb.mode.responsibilityChain.manager.GroupLeader;
import com.cmb.mode.responsibilityChain.manager.Handler;
import com.cmb.mode.responsibilityChain.manager.Manager;

/**
 * @Author gaozhao
 * @Param
 * @Return
 * @Description: 客户端-责任链模式
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
