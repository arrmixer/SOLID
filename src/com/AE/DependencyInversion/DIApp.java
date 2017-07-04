package com.AE.DependencyInversion;

/**
 * Created by Angel on 6/6/17.
 * this was my crack at DependencyInversion not perfect
 * by any means! lol
 */
public class DIApp {
    public static void main(String[] args) {
        LaptopManufacturingProcess newLapTop = new LaptopManufacturingProcess("Laptop");
        newLapTop.launchProcess();
        DeviceFactory iphone = new DeviceFactory();
        iphone.makeProduct(new SmartphoneManufacturingProcess("Iphone"));
    }
}
