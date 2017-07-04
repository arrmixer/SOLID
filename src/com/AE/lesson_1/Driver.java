package com.AE.lesson_1;

/**
 * Created by Angel on 5/25/17.
 */

//Driver depends on vehicle... Dependency  association
public class Driver {
    public void drive(Vehicle raceCar){
        raceCar.accelerate();
    }
}
