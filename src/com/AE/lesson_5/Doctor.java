package com.AE.lesson_5;

/**
 * Created by Angel on 5/29/17.
 */
public class Doctor extends Employee  {
    public Doctor(int id, String name, String department, boolean working) {
        super(id, name, department, working);
        System.out.println("Doctor in action....");
    }

    private void prescribeMedicine(){
        System.out.println("Prescribe Medicine");
    }

    private void diagnosePatients(){
        System.out.println("Diagnosing Patient");
    }

    @Override
    public void performDuties() {
        diagnosePatients();
        prescribeMedicine();

    }
}
