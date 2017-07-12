package com.AE.SingletonDesignPattern;

/**
 * Created by Angel on 7/6/17.
 */
public class App {
    public static void main(String[] args) {
        PerformanceStage stage = PerformanceStage.getInstance();

        stage.turnOnLights();
        System.out.println(stage.getCounter());

        PerformanceStage stage2 = PerformanceStage.getInstance();
        System.out.println(stage.getCounter());
    }


}
