package com.AE.DependencyInversion2.processes;

/**
 * Created by Angel on 6/6/17.
 */
public abstract class GeneralManufacturingProcess {

    private String processName;

    protected abstract void assembleDevice();

    protected abstract void testDevice();

    protected abstract void packageDevice();

    protected abstract void storeDevice();

    public GeneralManufacturingProcess(String processName) {
        this.processName = processName;
    }

    //the template method...
    public void launchProcess() {
        if (processName != null && !processName.isEmpty()) {

            assembleDevice();
            testDevice();
            packageDevice();
            storeDevice();
        } else {
            System.out.println("no process name was specified");
        }
    }
}
