/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revision;

/**
 *
 * @author Memo
 */
public class Blue extends Red {

    
    public void printColour() {
        super.printColour();
        System.out.println("blue");    }

  
    public void printProfile() {
        System.out.println("from BLUE CLASS"); 
        printColour();

    }
    
}
