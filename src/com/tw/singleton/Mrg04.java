package com.tw.singleton;

public class Mrg04 {
    private static Mrg04 INSTANCE;
    private Mrg04(){};

    public static Mrg04 getInstance(){
        if(INSTANCE==null){
            //双层锁
            synchronized (Mrg04.class){
                if (INSTANCE==null){
                    INSTANCE = new Mrg04();
                }
            }
        }
        return INSTANCE;
    }

}
