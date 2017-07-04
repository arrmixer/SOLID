package com.AE.DependencyInversion;

/**
 * Created by Angel on 6/6/17.
 */
public class SmartphoneManufacturingProcess extends GeneralManufacturing {
    public SmartphoneManufacturingProcess(String processName) {
        super(processName);
    }

    private void assembleDevice() {
        System.out.println("Assembling the " + getProcessName() + ".");
    }


    private void testDevice() {
        System.out.println("Testing the  " + getProcessName() + ".");
    }


    private void packageDevice() {
        System.out.println("Packaging the  " + getProcessName() + ".");
    }


    private void storeDevice() {
        System.out.println("Storing the " + getProcessName() + ".");
    }

    @Override
    public void launchProcess() {
        assembleDevice();
        testDevice();
        packageDevice();
        storeDevice();

    }


}
