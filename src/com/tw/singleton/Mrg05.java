package com.tw.singleton;

import org.omg.PortableInterceptor.INACTIVE;

/**
 * 懒汉模式（静态内部类）
 */
public class Mrg05 {
    private Mrg05(){};
    private static class Mrg05Holder{
        private static final Mrg05 INSTANCE = new Mrg05();
    }

    public static Mrg05 getInstance(){
        return  Mrg05Holder.INSTANCE;
    }
}
