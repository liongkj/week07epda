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
public class remote {
    
    TV myTV = new TV();
    
    public void pressButton(){
        myTV.change();
    }
    
}
