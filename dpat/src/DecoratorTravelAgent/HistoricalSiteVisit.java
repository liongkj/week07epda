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
public class HistoricalSiteVisit extends decorator{
    
    public HistoricalSiteVisit(iPackage Package) {
        super(Package);
    }
    
    public int Cost(){
        return this.Package.Cost() + 200;
    }
    
    public String desc(){
        return this.Package.desc() + " + Historical Site Visit";
    }
    
}
