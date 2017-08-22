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
public class Mum implements Observer{

    @Override
    public void Notify(tvstate tv) {
        System.out.println("Oh Mum gonna kill me coz i switched the tv " + tv.getClass().getSigners() );
    }
    
}
