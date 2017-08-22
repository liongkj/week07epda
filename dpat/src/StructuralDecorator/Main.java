/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StructuralDecorator;

/**
 *
 * @author xinquanteoh
 */
public class Main {

    public static void main(String[] args) {
        iPizza myPizza = new StandardPizza();
        
        iPizza newPizza = new cheese(myPizza);
        iPizza customizedPizza = new cheese (new cheese(myPizza));
        iPizza customizedPizza2 = new cheese (new cheese(newPizza));
        System.out.println(myPizza.getDesc());
        System.out.println(myPizza.getCost());
        
        System.out.println(newPizza.getDesc());
        System.out.println(newPizza.getCost());
        
        System.out.println(customizedPizza.getDesc());
        System.out.println(customizedPizza.getCost());
        
        System.out.println(customizedPizza2.getDesc());
        System.out.println(customizedPizza2.getCost());
    }
}

interface iPizza {//define what class can do

    public int getCost();

    public String getDesc();

}

class StandardPizza implements iPizza {

    @Override
    public int getCost() {
        return 8;
    }

    @Override
    public String getDesc() {
        return "Standard Pizza";
    }

}

class pizzaDecorator implements iPizza { //organizing and categorizing decorator

    iPizza tempPizza;

    public pizzaDecorator(iPizza tempPizza) {
        this.tempPizza = tempPizza;
    }

    @Override
    public int getCost() {
        return tempPizza.getCost();
    }

    @Override
    public String getDesc() {
        return tempPizza.getDesc();
    }

}

class cheese extends pizzaDecorator {

    public cheese(iPizza tempPizza) {
        super(tempPizza);
    }

    @Override
    public int getCost() {
        return tempPizza.getCost() + 6;
    }

    @Override
    public String getDesc() {
        return tempPizza.getDesc() + " > premium cheese";
    }

}

class Pineapple extends pizzaDecorator {

    public Pineapple(iPizza tempPizza) {
        super(tempPizza);
    }

    @Override
    public int getCost() {
        return tempPizza.getCost() + 4;
    }

    @Override
    public String getDesc() {
        return tempPizza.getDesc() + " > extra pineapple";
    }

}

class Onion extends pizzaDecorator {

    public Onion(iPizza tempPizza) {
        super(tempPizza);
    }

    @Override
    public int getCost() {
        return tempPizza.getCost() + 1;
    }

    @Override
    public String getDesc() {
        return tempPizza.getDesc() + " > extra onions";
    }

}
