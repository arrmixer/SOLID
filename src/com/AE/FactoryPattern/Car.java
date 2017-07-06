package com.AE.FactoryPattern;

/**
 * Created by Angel on 7/6/17.
 */
public class Car implements Vehicle{
    @Override
    public void startEngine() {
        System.out.println("Started car engine...");
    }
}
