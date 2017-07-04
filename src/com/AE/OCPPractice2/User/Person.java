package com.AE.OCPPractice2.User;

import com.AE.OCPPractice2.Devices.SurroundSound;
import com.AE.OCPPractice2.Devices.TV;
import com.AE.OCPPractice2.Remotes.RemoteControl;

/**
 * Created by Angel on 5/30/17.
 */
public class Person {
    public static void main(String[] args) {
        TV tv = new TV("UHD", "Samsung");
        SurroundSound yamaha = new SurroundSound("5.1", "Yamaha");
        RemoteControl remote = RemoteControl.getInstance();

        remote.connectTo(tv);
        remote.turnOn();
        remote.turnOff();
        remote.connectTo(yamaha);
        remote.turnOn();
    }
}
