package com.AE.ObserverPattern.Subject;

import com.AE.ObserverPattern.Observer.IObserver;

/**
 * Created by Angel on 7/4/17.
 */
public interface ISubject {
    public void registerObserver(IObserver o);
    public void removeObserver(IObserver o);
    public void notifyObservers();

}
