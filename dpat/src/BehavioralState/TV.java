/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehavioralState;

import java.util.LinkedList;

/**
 *
 * @author xinquanteoh
 */
public class TV {
    tvstate state;
    LinkedList<Observer> observers = new LinkedList<Observer>();
    
    public TV(){
        state = new Off();
        observers.addLast(new Mum());
        observers.addLast(new dad());
    }
    
    public void change(){
        state.turnOffOn(this);
        updateObservers();
    }
    
    public void setState(tvstate s){
        state = s;
    }
    
    public void updateObservers(){
        for (Observer o: observers){
            o.Notify(state);
        }
    }
}
