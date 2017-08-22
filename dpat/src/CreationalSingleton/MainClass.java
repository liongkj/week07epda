/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreationalSingleton;

/**
 *
 * @author xinquanteoh
 */
public class MainClass {

    public static void main(String[] args){
        singleton one = singleton.getInstance();
        singleton two = singleton.getInstance();
        
        System.out.println("one :" + one.hashCode());
        System.out.println("two :" + two.hashCode());
    }
}

class singleton{
    
    private static singleton s1;//private reference
    
    private singleton(){};//private constructor
    
    public static singleton getInstance(){ //entry point
        if(s1 == null){
            s1 = new singleton();
        }
        return s1;
    }
    
    
}