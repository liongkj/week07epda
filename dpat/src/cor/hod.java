/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cor;

/**
 *
 * @author kj
 */
public class hod implements ihandler{

    ihandler nextHandler;

    public hod() {
        nextHandler = new vp();
    }
     
    @Override
    public void processRequest(int request) {
        if (request > 2000){
            nextHandler.processRequest(request);
        }else{
            System.out.println(getClass().getSimpleName()+" is processing");
        }
    }

    @Override
    public void nextHandler(ihandler handler) {
        nextHandler = handler;
    }
    
    
}
