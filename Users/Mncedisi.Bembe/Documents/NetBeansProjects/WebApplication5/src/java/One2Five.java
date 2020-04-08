/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mncedisi.Bembe
 */
public class One2Five {
     public static void main(String[] args){
     
     Count2Five(1);
     }  
     public static void Count2Five(int i){
        if(i<6){
           System.out.print(i);
          Count2Five(i+1);
        }
        else
            System.out.println();
     }   
    
}
