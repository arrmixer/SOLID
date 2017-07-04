package com.AE.OCPPractice2.Devices;

/**
 * Created by Angel on 5/30/17.
 */
public abstract class Device {
    private String type;
    private String brand;

    public Device(String type, String brand) {
        this.type = type;
        this.brand = brand;
    }

    public String getType() {
        return type;
    }

    public String getBrand() {
        return brand;
    }
}
