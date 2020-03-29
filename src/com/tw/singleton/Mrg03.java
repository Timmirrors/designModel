package com.tw.singleton;

/**
 * 懒汉模式（加锁）
 */
public class Mrg03 {
    private static Mrg03 INSTANCE;
    private Mrg03(){}
    public static synchronized Mrg03 getInstance(){
        if(INSTANCE== null){
            INSTANCE = new Mrg03();
        }
        return INSTANCE;
    }
}
