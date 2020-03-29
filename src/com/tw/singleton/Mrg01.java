package com.tw.singleton;

/**
 * 单例模式
 *饿汉模式
 */
public class Mrg01 {
    private static final Mrg01 INSTANCE =new Mrg01();
    //构造器私有化
    private void Mrg01(){
    }
    public static Mrg01 getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {
        Mrg01 m1 = Mrg01.getInstance();
        Mrg01 m2 = Mrg01.getInstance();
        System.out.println(m1 == m2);
    }
}
