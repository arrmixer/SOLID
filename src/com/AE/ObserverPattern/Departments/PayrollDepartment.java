package com.AE.ObserverPattern.Departments;

import com.AE.ObserverPattern.IObserver;

/**
 * Created by Angel on 7/4/17.
 */
public class PayrollDepartment implements IObserver {

    private String employee;

    public PayrollDepartment(String employee) {
        this.employee = employee;
    }

    @Override
    public void callMe() {
        System.out.println("Called Payroll.");
    }
}
