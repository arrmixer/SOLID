package com.AE.FactoryPattern;

/**
 * Created by Angel on 7/6/17.
 */
public class VehicleFactory {
    public Vehicle getVehicle(VehicleType vehicleType){
      return vehicleType.getVehicle();
    }
}
