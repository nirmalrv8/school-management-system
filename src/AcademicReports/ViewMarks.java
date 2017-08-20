/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AcademicReports;
import java.sql.*;
import javax.swing.*;


public class ViewMarks {
  
   public ResultSet getResults(String sid){
   
       Connection c;
       c=DBclass.connect();
       PreparedStatement ps;
       ResultSet r=null;
      try{
       
          
          ps=c.prepareStatement("SELECT * FROM Marks WHERE regNum=?");
          ps.setString(1, sid);
          
           r = ps.executeQuery();
          
           if(!r.isBeforeFirst())
              JOptionPane.showMessageDialog(null, "Invalid Student ID number.Enter Student ID number again");
           
             return r;
          
      }
      catch(SQLException ex){
          JOptionPane.showMessageDialog(null, ex);
          return null;
      }
       
  
      
   
   }
    
}
