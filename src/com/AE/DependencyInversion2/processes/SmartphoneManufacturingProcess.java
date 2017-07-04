package com.AE.DependencyInversion2.processes;

/**
 * Created by Angel on 6/6/17.
 */
public class SmartphoneManufacturingProcess extends GeneralManufacturingProcess {
    public SmartphoneManufacturingProcess(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("Assembled...");
    }

    @Override
    protected void testDevice() {
        System.out.println("testing..");
    }

    @Override
    protected void packageDevice() {
        System.out.println("Packaging...");
    }

    @Override
    protected void storeDevice() {
        System.out.println("storing....");
    }
}
