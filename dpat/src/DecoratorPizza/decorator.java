/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorPizza;

/**
 *
 * @author xinquanteoh
 */
public class decorator implements Ipizza {
        
    public decorator(Ipizza tempPizza){
        this.tempPizza = tempPizza;
    }
    
    Ipizza tempPizza;
    
    @Override
    public int Cost(){
        return tempPizza.Cost();
    }
    
}
