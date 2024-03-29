package com.cmb.mode.observer;

/**
 * @Author gaozhao 
 * @Param
 * @Return  
 * @Description: 具体观察者
 */
public class NBAObserver extends Observer {
    public NBAObserver(String name, Subject subject) {
        super(name, subject);
    }

    @Override
    public void update() {
        System.out.println(subject.getAction() + "\n" + name + "关闭股票行情，继续工作");
    }
}
