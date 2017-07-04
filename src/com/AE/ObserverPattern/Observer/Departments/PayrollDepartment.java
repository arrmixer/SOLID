package com.AE.ObserverPattern.Observer.Departments;

import com.AE.ObserverPattern.Observer.IObserver;
import com.AE.ObserverPattern.Personel.Employee;

/**
 * Created by Angel on 7/4/17.
 */
public class PayrollDepartment implements IObserver {
    @Override
    public void callMe(Employee emp, String msg) {
        System.out.println("Payroll Department notified");
        System.out.println(msg + " " + emp.getName());
    }
}

