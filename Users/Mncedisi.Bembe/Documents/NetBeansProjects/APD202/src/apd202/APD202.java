/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apd202;

/**
 *
 * @author Mncedisi.Bembe
 * 
 */
import java.sql.*;
public class APD202 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        final String URL = "jdbc:derby://localhost:1527/CoffeeDB";
        try{
            Connection conOb = DriverManager.getConnection(URL);
            Statement stmOb = conOb.createStatement();
            ResultSet resOb = stmOb.executeQuery("SELECT * FROM Coffee");
            System.out.println("Description    ProdID    Price");
            
            while(resOb.next()){
                System.out.println(resOb.getString(1)+""+resOb.getString(2)+""+resOb.getString(3));
            }
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }
    }
    
}
