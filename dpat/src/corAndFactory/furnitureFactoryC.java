/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package corAndFactory;

/**
 *
 * @author kj
 */
public class furnitureFactoryC implements igrade{
    furniture f;
    igrade nextGrade;

    public furnitureFactoryC() {
        nextGrade = new furnitureFactoryB();
    }
    
public furniture makeFurniture(String s) {
        
        if (s.equals("c")) {
            f = new chair();
        }
        if (s.equals("t")) {
            f = new table();
        }
        if (s.equals("s")) {
            f = new shelves();
        }

        return f;
    }

    @Override
    public void processGrade(String grade, String furniture) {
        makeFurniture(furniture);
        if (grade.equals("a")){
            
            System.out.println(getClass().getSimpleName() + " is processing your order");
        }else{
            nextGrade.processGrade(grade, furniture);
        }
    }

    @Override
    public void setNextFactory(igrade g) {
        nextGrade = g;
    }
}
