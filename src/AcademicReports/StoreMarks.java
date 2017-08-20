/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcademicReports;
import java.sql.*;
import javax.swing.JOptionPane;



public class StoreMarks {

public void setMarks(String x,String y,String z){

    Connection c;
    c= DBclass.connect();
    PreparedStatement ps;
    
   try{
       ps=c.prepareStatement("INSERT INTO Marks VALUES(?,?,?)");
       ps.setString(1,x);
       ps.setString(2,y);
       ps.setString(3,z);
       
       ps.execute();
   }
   
     catch(SQLException ex){
            JOptionPane.showMessageDialog(null,"wrong sql " + ex.getMessage());
        }
} 


    
}
