package com.AE.ObserverPattern;

import com.AE.ObserverPattern.Observer.Departments.HRDepartment;
import com.AE.ObserverPattern.Observer.Departments.PayrollDepartment;
import com.AE.ObserverPattern.Observer.IObserver;
import com.AE.ObserverPattern.Personel.Employee;
import com.AE.ObserverPattern.Subject.EmployeeManagementSystem;

import java.util.Date;

/**
 * Created by Angel on 7/4/17.
 */
public class App {
    public static void main(String[] args) {
        IObserver payroll = new PayrollDepartment();
        IObserver hrSystem = new HRDepartment();

        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        ems.registerObserver(payroll);
        ems.registerObserver(hrSystem);

        Employee bob = new Employee("Bob", new Date(), 35000, true);
        ems.hireEmployee(bob);

        ems.modifyEmployeeName(5, "Imatiz");
        ems.modifyEmployeeName(2, "Imitaz");


    }

}
