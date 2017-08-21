/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdminPanel;

   
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Teacher {
    
    Connection con=null;
    PreparedStatement pst =null;
    ResultSet rs=null;
    
    public Teacher()
    {
        con=ConnectDB.connect();
    }
     Teachers_Details te=new Teachers_Details();
     
    void add(String id,String fname,String lname,String address,int phone,int age,String date)
    {
        try{
           
            String sql="INSERT INTO Teacher(Teacher_ID,fname,lname,address,phone,age,Date_Joined )"
                    +"VALUES('"+id+"','"+fname+"','"+lname+"','"+address+"','"+phone+"','"+age+"','"+date+"')";
           
            pst = con.prepareStatement(sql);
            pst.execute(sql);
        
        }
        catch(Exception e){
            System.out.println("erro");
        }
    }
    public void delete(String tid)
    {
        try{
            String de="DELETE FROM `Teacher` WHERE Teacher_ID=?";
            pst=con.prepareStatement(de);
            
            pst.setString(1,tid);
            
           int msg= JOptionPane.showConfirmDialog(null,"Do you want to delete Teacher ID : "+tid,"close",JOptionPane.YES_OPTION,JOptionPane.NO_OPTION);
            if(msg==JOptionPane.YES_OPTION)
            {
                pst.executeUpdate();
            }
           
         
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
        }
    }
    
   
}
