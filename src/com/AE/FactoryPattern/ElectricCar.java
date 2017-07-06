package com.AE.FactoryPattern;

/**
 * Created by Angel on 7/6/17.
 */
public class ElectricCar implements Vehicle {
    @Override
    public void startEngine() {
        System.out.println("Pushed button. Starting electric car...");
    }
}
