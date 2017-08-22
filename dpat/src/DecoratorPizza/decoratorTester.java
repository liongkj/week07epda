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
public class decoratorTester {
    public static void main(String[] args) {
        Ipizza myPizza = new StandardPizza();
        
        System.out.println(myPizza.Cost());
        
        Ipizza CustomPizza = new Cheese(myPizza);
        
        Ipizza CustomPizza2 = new Cheese(new StandardPizza());
        
        System.out.println(CustomPizza.Cost());
        
        System.out.println(CustomPizza2.Cost());
        
    }
}
