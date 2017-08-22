/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CreationalFactorySingleton;

/**
 *
 * @author xinquanteoh
 */
public class Main {
    public static void main(String[] args) {
        StudentFactory SF1 = StudentFactory.getFactoryInstance();
        Student undergrad = SF1.getStudentInstance("U");       
    }
}

class anotherclass{
    
    public void somemethod(){
        StudentFactory SF2 = StudentFactory.getFactoryInstance();
        Student someStudent  = SF2.getStudentInstance("adasda");
    }
}

class Student {
}

class PG extends Student {
}

class UG extends Student {
}

class StudentFactory {

    private static StudentFactory SF = new StudentFactory();
    
    private StudentFactory(){};
    
    private Student S1;
    
    public static StudentFactory getFactoryInstance(){
 
        return SF;
    }

    public Student getStudentInstance(String s) {
        if (s.equalsIgnoreCase("P")) {
            S1 = new PG();
        } else if (s.equalsIgnoreCase("U")) {
            S1 = new UG();
        }
        
        return S1;
    }
}
