package com.cmb.mode.singleton;

/**
 * gaozhao special annotation
 *
 * @Package: com.cmb.mode.singleton
 * @FileName: SingletonOne.java
 * @ClassName: SingletonOne
 * @Description: 懒汉写法（线程不安全）
 * @Author: 94068
 * @CreateDate: 2021/5/31 21:34
 * @UpdateUser: 94068
 * @UpdateDate: 2021/5/31 21:34
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
public class SingletonOne {

    private static SingletonOne singleton;

    private SingletonOne() {
    }

    public static SingletonOne getInstance() {
        if (singleton == null) {
            singleton = new SingletonOne();
        }
        return singleton;
    }
}
