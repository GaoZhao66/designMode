package com.cmb.mode.singleton;

/**
 * gaozhao special annotation
 *
 * @Package: com.cmb.mode.singleton
 * @FileName: SingletonTwo.java
 * @ClassName: SingletonTwo
 * @Description: 懒汉式写法（线程安全）
 * @Author: 94068
 * @CreateDate: 2021/5/31 21:35
 * @UpdateUser: 94068
 * @UpdateDate: 2021/5/31 21:35
 * @UpdateRemark: 说明本次修改内容
 * @Version: v1.0
 */
public class SingletonTwo {

    private static SingletonTwo instance;

    private SingletonTwo() {
    }

    public static synchronized SingletonTwo getInstance() {
        if (instance == null) {
            instance = new SingletonTwo();
        }
        return instance;
    }
}
