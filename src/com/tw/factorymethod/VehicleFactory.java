package com.tw.factorymethod;

/**
 * 简单工厂
 */
public class VehicleFactory {
    public Car createCar(){
        //before processing
        return new Car();
    }
    public Boom createBroom(){
        return new Boom();
    }
}
