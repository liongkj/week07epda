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
public interface igrade {
    public void processGrade(String grade, String furniture);
    public void setNextFactory(igrade g);
}
