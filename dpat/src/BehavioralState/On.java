/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BehavioralState;

/**
 *
 * @author xinquanteoh
 */
public class On implements tvstate{

    @Override
    public void turnOffOn(TV tv) {
        tv.setState(new Off());
        System.out.println("tv has been switched off");
    }
    
}
