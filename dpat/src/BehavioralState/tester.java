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
public class tester {
    static remote re = new remote();
    public static void main(String[] args) {
        while(true){
            press();
            re.pressButton();
        }
    }
    
    public static void press(){};
    
}
