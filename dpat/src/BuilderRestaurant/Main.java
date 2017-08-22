/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BuilderRestaurant;

import java.util.LinkedList;

/**
 *
 * @author xinquanteoh
 */
public class Main {
    public static void main(String[] args){
        Mealbuilder order = new takeaway();
        director dir = new director();
        dir.buildOrder(order);
        
        Order newOrder = order.getorder();
    }
}

interface Mealbuilder{
    public void addStarter();
    public void addMain();
    public void addDrink();
    
    public Order getorder();
}

class Order{
    
    LinkedList<String> orderDetails = new LinkedList<String>();
    
    public void addItem(String s){
        orderDetails.addLast(s);
    }    
}

class takeaway implements Mealbuilder{
    
    private Order myOrder = new Order();

    @Override
    public void addStarter() {
        myOrder.addItem("soup");
    }

    @Override
    public void addMain() {
        myOrder.addItem("chicken");
    }

    @Override
    public void addDrink() {
        myOrder.addItem("Orange Juice");
    }

    @Override
    public Order getorder() {
        return myOrder;
    }
       
}

class eatin implements Mealbuilder{
    
    private Order myOrder = new Order();

    @Override
    public void addStarter() {
        myOrder.addItem("Salad");
    }

    @Override
    public void addMain() {
        myOrder.addItem("Beef");
    }

    @Override
    public void addDrink() {
        myOrder.addItem("Watermelon Juice");
    }
    
    @Override
    public Order getorder() {
        return myOrder;
    }
       
       
}

class director {
    
    private Mealbuilder MB;
    
    public void buildOrder (Mealbuilder b){
        
        MB = b;
        MB.addDrink();
        MB.addMain();
        MB.addStarter();
        
    }
}

