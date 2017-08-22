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
public class Cheese extends decorator{
    
    public Cheese(Ipizza tempPizza){
        super(tempPizza);
    }
    
    @Override
    public int Cost(){
        return tempPizza.Cost() + 4;
    }
    
}
