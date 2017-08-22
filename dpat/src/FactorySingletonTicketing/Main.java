/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FactorySingletonTicketing;

import java.util.Scanner;

/**
 *
 * @author xinquanteoh
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter Ticket type: a, s, c");
        
        String choice = s.next();
        
        TicketFactory TF = TicketFactory.getTicketFactory();
        Ticket myTicket = TF.getTicket(choice);
        
        System.out.println(myTicket.TicketPrice());
        
    }
}

abstract class Ticket{
    public int TicketPrice(){
        return 10;
    }
}

class adult extends Ticket{

    @Override
    public int TicketPrice() {
        return 12;
    }
}

class child extends Ticket{

    @Override
    public int TicketPrice() {
        return 8;
    } 
}

class student extends Ticket{

    @Override
    public int TicketPrice() {
        return 10;
    }  
}

class TicketFactory{
    private static TicketFactory TF = new TicketFactory();
    
    public Ticket Ticket;
    
    private TicketFactory(){};
    
    public static TicketFactory getTicketFactory(){       
        return TF;
    }
    
    public Ticket getTicket(String s){
        if(s.equalsIgnoreCase("A")){
            Ticket = new adult();
        }else if (s.equalsIgnoreCase("C")){
            Ticket = new child();
        }else if (s.equalsIgnoreCase("S")){
            Ticket = new student();
        }
        
        return Ticket;
    }
             
}
