package com.AE.DependencyInjection;

/**
 * Created by Angel on 6/12/17.
 */
public class App {
    public static void main(String[] args) {
        Vehicle raceCar = new Vehicle(new LargeEngine(500));
        raceCar.crankIgnition();
    }
}
