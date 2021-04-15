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
public class JavaApplication5{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Red x[]={new Yellow(),new Green(),new Blue(),new Red()};
       for(int i=0;i<x.length;i++)
       {x[i].printColour();
       x[i].printProfile();
           
       }
       
          
    }
    
}
