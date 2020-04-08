/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mncedisi.Bembe
 */
public class One2n {
     public static void main(String[] args){
     int x;
     x=8;
     Count2n(1,x);
     }  
     public static void Count2n(int i, int n){
        if(i<=n){
           System.out.print(i);
          Count2n(i+1,n);
        }
        else
            System.out.println();
     }   
    
}
