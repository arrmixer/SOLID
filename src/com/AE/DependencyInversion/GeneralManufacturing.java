package com.AE.DependencyInversion;

/**
 * Created by Angel on 6/6/17.
 */
public abstract class GeneralManufacturing {
    private String processName;

    public GeneralManufacturing(String processName) {
        this.processName = processName;
    }

    abstract void launchProcess();

    public String getProcessName() {
        return processName;
    }




}
