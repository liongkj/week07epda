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
public class Customer {
    public static void main(String[] args) {
        iPackage StandardPackage = new StandardPackage();
        
        System.out.println("This package costs RM" + StandardPackage.Cost() + " and " + StandardPackage.desc());
        
        iPackage CustomPackage = new HistoricalSiteVisit(StandardPackage);
        
        System.out.println("This package costs RM" + CustomPackage.Cost() + " and " + CustomPackage.desc());
        
        iPackage CustomPackage2 = new BeachExcursion(CustomPackage);
        
        System.out.println("This package costs RM" + CustomPackage2.Cost() + " and " + CustomPackage2.desc());
        
        iPackage CustomPackage3 = new BeachExcursion(new HistoricalSiteVisit(new StandardPackage()));//another way to instantiate
        
        System.out.println("This package costs RM" + CustomPackage3.Cost() + " and " + CustomPackage3.desc());
    }
}
