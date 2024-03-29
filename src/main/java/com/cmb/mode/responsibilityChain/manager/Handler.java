package com.cmb.mode.responsibilityChain.manager;

import com.cmb.mode.responsibilityChain.leave.ILeave;

/**
 * gaozhao special annotation
 *
 * @Package: com.cmb.mode
 * @FileName: Handler.java
 * @ClassName: Handler
 * @Description: 处理者抽象类
 * @Author: gaozhao
 * @CreateDate: 2020/3/9 9:50
 * @UpdateUser: gaozhao
 * @UpdateDate: 2020/3/9 9:50
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
public abstract class Handler {

    protected final static int NUM_ONE = 1;

    protected final static int NUM_THREE = 1;

    protected final static int NUM_SEVEN = 1;

    /**
     * 该领导处理的请假天数区间
     */
    private int numStart = 0;

    private int numEnd = 0;

    /**
     * 领导上面还有领导
     */
    private Handler nextHandler;

    /**
     * 设置请假天数范围 上不封顶
     */
    public Handler(int numStart) {
        this.numStart = numStart;
    }

    /**
     * 设置请假天数范围
     */
    public Handler(int numStart, int numEnd) {
        this.numStart = numStart;
        this.numEnd = numEnd;
    }

    /**
     * 设置上级领导
     */
    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    /**
     * 提交请假条
     */
    public final void submit(ILeave leave) {
        if (0 == this.numStart) {
            return;
        }
        //如果请假天数达到该领导者的处理要求
        if (leave.getNum() >= this.numStart) {
            this.handleLeave(leave);
            //如果还有上级 并且请假天数超过了当前领导的处理范围
            if (null != this.nextHandler && leave.getNum() > numEnd) {
                this.nextHandler.submit(leave);//继续提交
            }
        }
    }

    /**
     * 各级领导处理请假条方法
     */
    protected abstract void handleLeave(ILeave leave);
}
