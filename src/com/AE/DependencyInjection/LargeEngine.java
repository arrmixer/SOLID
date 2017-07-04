package com.AE.DependencyInjection;

/**
 * Created by Angel on 6/12/17.
 */
public class LargeEngine implements Engine{
    private int horsepower;

    public LargeEngine(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public void startingEngine() {
        System.out.println("started large " + horsepower + "hp engine");
    }
}
