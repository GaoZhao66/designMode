package com.cmb.mode.singleton;

/**
 * gaozhao special annotation
 *
 * @Package: com.cmb.mode.singleton
 * @FileName: SingletonThree.java
 * @ClassName: SingletonThree
 * @Description: 饿汉式写法
 * @Author: 94068
 * @CreateDate: 2021/5/31 21:36
 * @UpdateUser: 94068
 * @UpdateDate: 2021/5/31 21:36
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
public class SingletonThree {

    private static SingletonThree instance = new SingletonThree();

    private SingletonThree() {
    }

    public static SingletonThree getInstance() {
        return instance;
    }
}
