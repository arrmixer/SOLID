package com.AE.OCPPractice2.Remotes;

import com.AE.OCPPractice2.Devices.Control;
import com.AE.OCPPractice2.Devices.Device;

/**
 * Created by Angel on 5/30/17.
 */
public class RemoteControl extends Device {

    Control control = null;

    private static RemoteControl remoteControl = new RemoteControl("Universal", "Logitech");

    private RemoteControl(String type, String brand){
        super(type, brand);
    }

    public static RemoteControl getInstance(){
        return remoteControl;
    }

    public void connectTo(Control aDevice){
        this.control = aDevice;
        System.out.println(" the remote is making the connection... ");
    }

    public void turnOn(){
        control.turnOn();
    }

    public void turnOff(){
        control.turnOff();
    }


}
