/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apd;

/**
 *
 * @author Mncedisi.Bembe
 */
public class APD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        printInt(3);
    }
        
    public static void printInt(int n){
        if(n!=0){
             printInt(n-1);
             System.out.print(n);
        }
        else 
            System.out.println("");
    }
   
}
    
