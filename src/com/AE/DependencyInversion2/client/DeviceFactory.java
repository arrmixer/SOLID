package com.AE.DependencyInversion2.client;

import com.AE.DependencyInversion2.processes.GeneralManufacturingProcess;
import com.AE.DependencyInversion2.processes.SmartphoneManufacturingProcess;

/**
 * Created by Angel on 6/6/17.
 */
public class DeviceFactory {
    public static void main(String[] args) {
        GeneralManufacturingProcess manufacturer = new SmartphoneManufacturingProcess("Iphone");
        manufacturer.launchProcess();
    }
}
