package com.AE.FactoryPattern;

/**
 * Created by Angel on 7/6/17.
 */
public class Truck implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("started truck engine..");
    }
}
