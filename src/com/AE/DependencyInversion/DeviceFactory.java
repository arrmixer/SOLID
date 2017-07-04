package com.AE.DependencyInversion;


/**
 * Created by Angel on 6/6/17.
 */
public class DeviceFactory {




    public void makeProduct(GeneralManufacturing manufacturingProcess){
        System.out.println("Making a " + manufacturingProcess.getProcessName() );

        manufacturingProcess.launchProcess();
    }
}
