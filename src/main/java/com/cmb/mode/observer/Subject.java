package com.cmb.mode.observer;

/**
 * @Author gaozhao 
 * @Param
 * @Return  
 * @Description: 通知者接口
 */
public interface Subject {
    //增加
    public void attach(Observer observer);
    //删除
    public void detach(Observer observer);
    //通知
    public void notifyObservers();

    //状态
    public void setAction(String action);
    public String getAction();
}
