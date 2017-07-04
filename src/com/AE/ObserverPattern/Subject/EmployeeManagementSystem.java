package com.AE.ObserverPattern.Subject;

import com.AE.ObserverPattern.Observer.IObserver;
import com.AE.ObserverPattern.Personel.Employee;
import com.AE.ObserverPattern.Personel.EmployeeDAO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Angel on 7/4/17.
 */
public class EmployeeManagementSystem implements ISubject{
    private EmployeeDAO employeeDAO;
    String msg;
    private List<IObserver> observers;
    private List<Employee> employees;
    private Employee employee;

    public EmployeeManagementSystem(){
        observers = new ArrayList<IObserver>();
        employeeDAO = new EmployeeDAO();
        employees = employeeDAO.generateEmployees();

    }


    public void notifyObservers() {
      for(IObserver departments : observers){
            departments.callMe(employee, msg);
        }
    }

    public void registerObserver(IObserver o){
        observers.add(o);
    }

    public void removeObserver(IObserver o){
        observers.remove(o);
    }

    public void hireEmployee(Employee emp){
        employee = emp;
        msg = "New Hire: ";
        employees.add(emp);
        notifyObservers();
    }

    public void modifyEmployeeName(int id, String newName){
        boolean notify = false;

        for(Employee emp: employees){
            if(id == emp.employeeID){
                emp.setName(newName);
                this.employee = emp;
                this.msg = "Employee name has been modified";
                notify = true;
            }
        }
        if(notify){
            notifyObservers();
        }
    }
}
