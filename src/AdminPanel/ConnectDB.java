/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminPanel;


import java.sql.*;

/**
 *
 * @author tharindu
 */
public class ConnectDB {
    
    public static Connection connect()
    {
     
        Connection conn =null;
        try
        {
            
            Class.forName("com.mysql.jdbc.Driver");
            conn = (Connection) DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net:3306/sql12190627","sql12190627","NVDSmlsYRM");
            
            
        }   
        catch(Exception e)
        {
            System.out.println(e);
        }
        
        
        
        return conn;
    
    
    }
}
