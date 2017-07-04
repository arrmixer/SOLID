package com.AE.OCPPractice.Remotes;

import com.AE.OCPPractice.Devices.Device;

/**
 * Created by Angel on 5/29/17.
 * Practicing the Open Closed Principle
 */
public class RemoteControl extends Device implements Control {
    private static final RemoteControl remote = new RemoteControl("Universal", "Logitech");

    private RemoteControl(String type, String brand) {
        super(type, brand);
    }

    public static RemoteControl getRemoteControlInstance(){
        return remote;
    }

    @Override
    public void connect(Device device) {
        System.out.println( device.getBrand() + " is connected.");
    }

    @Override
    public void on(Device device) {
        System.out.println(device.getBrand() + " " + device.getType() + " is on.");
    }

    @Override
    public void off(Device device) {
        System.out.println(device.getBrand() + " is off.");
    }
}
