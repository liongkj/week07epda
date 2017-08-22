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
public interface ihandler {
    
    public void processRequest(int request);
    public void nextHandler(ihandler handler);
}
