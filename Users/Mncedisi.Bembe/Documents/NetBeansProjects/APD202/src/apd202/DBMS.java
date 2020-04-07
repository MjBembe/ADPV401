/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apd202;

import java.sql.DriverManager;

/**
 *
 * @author Mncedisi.Bembe
 */
import java.sql.*;
public class DBMS {
    public static void main(String[] args){
        final String URI = "jdbc:derby://localhost:1527/CoffeeDB";
        try{
            Connection conOb = DriverManager.getConnection(URI);
            Statement stmOb = conOb.createStatement();
            ResultSet resOb= stmOb.executeQuery("SELECT * FROM Coffee");
            while(resOb.next()){
                System.out.println(resOb.getString(3));
            }
            
            
        }catch(SQLException ex){
            System.out.println(ex.getMessage());        
        }
    }
    
}
