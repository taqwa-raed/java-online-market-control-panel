/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalpro.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author FOR LAPTOP
 */
public class CusConn {
     static Connection  conn ;
       
    public static Connection getConnection() {
    try {
           
       try {
                //Registering the Driver Class
                 Class.forName("com.mysql.jdbc.Driver");
             
                //Connecting to the Database
                 String connectionUrl = "jdbc:mysql://localhost:3306/market";
        
                //Connecting to the Database 
                 conn = DriverManager.getConnection(connectionUrl,"root","");
            } catch (SQLException ex) {
                // log an exception. fro example:
                System.out.println("Failed to create the database connection."); 
            }
        } catch (ClassNotFoundException ex) {
            // log an exception. for example:
            System.out.println("Driver not found."); 
            
        }
        return conn;
    }
    
    
}
