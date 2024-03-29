package com.cmb.mode.observer;

/**
 * @Author gaozhao
 * @Param
 * @Return
 * @Description: 观察者模式
 */
public class SecretaryClient {
    public static void main(String[] args) {
        //前台为通知者
        Secretary secretary = new Secretary();

        StockObserver observer = new StockObserver("adam", secretary);
        NBAObserver observer2 = new NBAObserver("tom", secretary);

        //前台通知
        secretary.attach(observer);
        secretary.attach(observer2);

        //adam没被前台通知到，所以被老板抓了个现行
        secretary.detach(observer);

        //老板回来了
        secretary.setAction("小心！Boss回来了！");
        //发通知
        secretary.notifyObservers();
    }
}
