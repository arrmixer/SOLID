package com.AE.OCPPractice2.Devices;

/**
 * Created by Angel on 5/30/17.
 */
public class TV extends Device implements Control {
    public TV(String type, String brand) {
        super(type, brand);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " " + getType() + " is on.");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " " + getType() + " is off.");
    }
}
