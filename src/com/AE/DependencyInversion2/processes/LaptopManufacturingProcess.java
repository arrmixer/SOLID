package com.AE.DependencyInversion2.processes;

/**
 * Created by Angel on 6/6/17.
 */
public class LaptopManufacturingProcess extends GeneralManufacturingProcess {
    public LaptopManufacturingProcess(String processName) {
        super(processName);
    }

    @Override
    protected void assembleDevice() {
        System.out.println("assebling...");
    }

    @Override
    protected void testDevice() {
        System.out.println("testing..");
    }

    @Override
    protected void packageDevice() {
        System.out.println("packaging...");
    }

    @Override
    protected void storeDevice() {
        System.out.println("storing...");
    }
}
