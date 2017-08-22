/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Handler;

/**
 *
 * @author xinquanteoh
 */
public class Main {
    public static void main(String[] args) {
        lineManager lm = new lineManager();
        hos HOS = new hos();
        dean d = new dean();
        
        lm.setNextHandler(HOS);
        HOS.setNextHandler(d);
      
        lm.authoriseConf(6000);
        
    }
}

interface handler {

    public void authoriseConf(int x);

    public void setNextHandler(handler h);
    
}

class lineManager implements handler {

    handler myHandler;

//    public lineManager(){
//        myHandler = new hos();
//    }
        
    @Override
    public void authoriseConf(int x) {
        if (x < 500) {
            System.out.println("line manager is authorising trip");

        } else {
            myHandler.authoriseConf(x);
        }
    }

    @Override
    public void setNextHandler(handler h) {
        myHandler = h;
    }
}

class hos implements handler {

    handler myHandler;
    
    @Override
    public void authoriseConf(int x) {
        if (x < 1000) {
            System.out.println("hos is authorising trip");

        } else {
            myHandler.authoriseConf(x);
        }
    }

    @Override
    public void setNextHandler(handler h) {
        myHandler = h;
    }
}

class dean implements handler {

    handler myHandler;

    @Override
    public void authoriseConf(int x) {
        if (x < 5000) {
            System.out.println("dean is authorising trip");

        } else {
            System.out.println("sorry too expensive");
        }
    }

    @Override
    public void setNextHandler(handler h) {
        myHandler = h;
    }
}
