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
public class TestCon {
    public static void main(String[] args){
        final String URL = "jdbc:derby://localhost:1527/StudnetsDB";
        try{
            Connection ConObjec = DriverManager.getConnection(URL);
            System.out.println("Connection was succesfully established");
            ConObjec.close();
            System.out.println("Connection was succesfully closed");
        }
        catch(SQLException e){
            System.out.println(e.getMessage());
        }

    
    }
    
}
