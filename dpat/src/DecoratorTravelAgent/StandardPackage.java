/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DecoratorTravelAgent;

/**
 *
 * @author xinquanteoh
 */
public class StandardPackage implements iPackage{

    @Override
    public int Cost() {
        return 1500;
    }

    @Override
    public String desc() {
        return "involes 4 nights accommodation";
    }
    
}
