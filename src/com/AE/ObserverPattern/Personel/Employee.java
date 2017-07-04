package com.AE.ObserverPattern.Personel;

import java.util.Date;

/**
 * Created by Angel on 7/4/17.
 */
public class Employee {
    private String name;
    private Date hireDate;
    private int salary;
    public int employeeID;
    private boolean unemployed = false;

    private static int COUNTER;

    public Employee(String name, Date hireDate, int salary, boolean unemployed) {
        this.name = name;
        this.hireDate = hireDate;
        this.salary = salary;
        this.unemployed = unemployed;

        employeeID = ++COUNTER;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", employeeID=" + employeeID +
                ", unemployed=" + unemployed +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmployeeID() {
        return this.employeeID;
    }
}
