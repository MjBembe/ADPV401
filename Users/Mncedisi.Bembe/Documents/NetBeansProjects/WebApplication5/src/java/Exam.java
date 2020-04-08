/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mncedisi.Bembe
 */
public class Exam {
    public static void main(String[] args){
        System.out.println("The output is:");
        bar(211);
        System.out.println();
    }
    public static void bar(int number) {
        if (number > 0) {
            int d = number % 10;
            System.out.println(d);
            boolean even = (number / 10) % 2 == 0;
            System.out.println(even);
            bar(number / 10);
            if (even)
                System.out.print(d / 2 + 4);
            else
                System.out.print(d / 2 + 3);
        }
    }
}
    
