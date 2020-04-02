package com.tw.factorymethod;

public class CarFactory {
    public Moveable create() {
        System.out.println("a car Created");
        return new Car();
    }
}
