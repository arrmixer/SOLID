package com.AE.ObserverPattern.Observer.Departments;

import com.AE.ObserverPattern.Observer.IObserver;
import com.AE.ObserverPattern.Personel.Employee;

/**
 * Created by Angel on 7/4/17.
 */
public class HRDepartment implements IObserver {


    @Override
    public void callMe(Employee emp, String msg) {
        System.out.println("HR Department notified");
        System.out.println(msg + " " + emp.getName());
    }
}
