package com.AE.SingletonDesignPattern;

/**
 * Created by Angel on 7/6/17.
 */
public class PerformanceStage {
    private static int counter;

    private static PerformanceStage INSTANCE = null;

    private PerformanceStage(){
        counter++;
    }

    public synchronized static PerformanceStage getInstance(){
        if(INSTANCE == null){
            INSTANCE = new PerformanceStage();
        }
        return INSTANCE;
    }

    public void turnOnLights(){
        System.out.println("turn on lights...");
    }

    public int getCounter(){
        return counter;
    }

}
