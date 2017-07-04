package com.AE.DependencyInjection;

/**
 * Created by Angel on 6/12/17.
 */
public class SmallEngine implements Engine{
    private int horsePoswer;

    public SmallEngine(int horsePoswer) {
        this.horsePoswer = horsePoswer;
    }

    @Override
    public void startingEngine() {
        System.out.println("started small " + horsePoswer + "hp engine");
    }
}
