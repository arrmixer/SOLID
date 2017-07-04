package com.AE.OCPPractice.User;

import com.AE.OCPPractice.Devices.SurroundSoundSystem;
import com.AE.OCPPractice.Devices.TV;
import com.AE.OCPPractice.Remotes.RemoteControl;

/**
 * Created by Angel on 5/29/17.
 */
public class Person {
    public static void main(String[] args) {
        TV tv = new TV("HDTV", "Samsung");
        System.out.println(tv.getBrand());
        System.out.println(tv.getType());
        SurroundSoundSystem yamaha = new SurroundSoundSystem("5.1 surround", "Yamaha");
        System.out.println(yamaha.getBrand());
        System.out.println(yamaha.getType());
        RemoteControl.getRemoteControlInstance().connect(tv);
        RemoteControl.getRemoteControlInstance().on(tv);

        RemoteControl.getRemoteControlInstance().connect(yamaha);
        RemoteControl.getRemoteControlInstance().on(yamaha);




    }
}
