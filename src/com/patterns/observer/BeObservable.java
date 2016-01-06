package com.patterns.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pep on 6/01/16.
 */
public abstract class BeObservable {

    private List<BeObserver> observers = new ArrayList<>();

    public void registerObserver (BeObserver observer){
        this.observers.add(observer);
    }
    public void removeObserver(BeObserver observer){
        observers.remove(observer);
    }
    public void notifyObservers(Object data){
        observers.forEach(
                observer -> observer.notify(data)
        );
    }


}
