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
public class decorator implements iPackage{

    public iPackage Package;
    
    public decorator (iPackage Package){
        this.Package = Package;
    }
    
    public int Cost() {
        return this.Package.Cost();
    }

    @Override
    public String desc() {
        return this.Package.desc();
    }
    
}
