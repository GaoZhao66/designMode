package com.cmb.mode.responsibilityChain.leave;

/**
 * gaozhao special annotation
 * @Package:      com.cmb.mode
 * @FileName:     Leave.java
 * @ClassName:    Leave
 * @Description:  请假条
 * @Author:       gaozhao
 * @CreateDate:   2020/3/9 9:47
 * @UpdateUser:   gaozhao
 * @UpdateDate:   2020/3/9 9:47
 * @UpdateRemark: 说明本次修改内容
 * @Version:      v1.0
 */
public class Leave implements ILeave {

    /**
     * 姓名
     * */
    private String name;

    /**
     * 请假天数
     * */
    private int num;

    /**
     * 请假内容
     * */
    private String content;

    public Leave(String name, int num, String content) {
        this.name = name;
        this.num = num;
        this.content = content;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getNum() {
        return num;
    }

    @Override
    public String getContent() {
        return content;
    }
}
