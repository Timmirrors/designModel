package com.tw.abstractfactory;


public class Main {
    public static void main(String[] args) {
//        Car c = new Car();
////        c.go();
////        AK47 ak47 = new AK47();
////        ak47.shoot();
////        Bread bread = new Bread();
////        bread.printName();
        Abstractfactory a = new MagicFactory();
        Food f = a.createFood();
        f.printName();
        Weapon w = a.createWeapon();
        w.shoot();
        Vehicle v = a.createVehicle();
        v.go();
    }
}
