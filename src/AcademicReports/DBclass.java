/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcademicReports;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jayakody
 */
public class DBclass {
        public static Connection connect() 
    {
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net/sql12190627","sql12190627","NVDSmlsYRM");
        } 
        catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex + " failed connection");
            return null;
        }
        
    return con;
    }
}