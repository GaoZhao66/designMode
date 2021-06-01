package com.cmb.mode.factory.abstractFactoryModel;

public class TestMain {
    public static void main(String[] args){
        IFactory factory = new Factory();
        factory.createProduct1().show();
        factory.createProduct2().show();
    }
}
