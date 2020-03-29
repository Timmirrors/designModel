package com.tw.singleton;

/**
 * 懒汉模式
 */
public class Mrg02 {
    private static Mrg02 INSTANCE;
    private void Mrg02(){}
    public static Mrg02 getInstance(){
        if (INSTANCE == null){
//            try{
//                Thread.sleep(10);
//            }catch (Exception e){
//                e.printStackTrace();
//            }
             INSTANCE = new Mrg02();
        }
        return  INSTANCE;
    }

    public static void main(String[] args) {
        for(int i = 0;i<=100;i++){
            new Thread(()-> System.out.println(Mrg02.getInstance().hashCode())).start();
        }
    }
}
