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
public class ceo implements ihandler{

    ihandler newHandler;

    public ceo() {
        
    }
    
    @Override
    public void processRequest(int request) {
        
            System.out.println(getClass().getSimpleName()+" is processing");
        
    }

    @Override
    public void nextHandler(ihandler handler) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
