package com.AE.ObserverPattern.Observer;

import com.AE.ObserverPattern.Personel.Employee;

/**
 * Created by Angel on 7/4/17.
 */
public interface IObserver {
   public void callMe(Employee emp, String msg);
}
