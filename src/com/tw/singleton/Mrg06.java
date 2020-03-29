package com.tw.singleton;

public enum  Mrg06 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i =0;i<=100;i++){
            new Thread(()-> System.out.println(Mrg06.INSTANCE.hashCode())).start();
        }
    }
}
