/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

/**
 *
 * @author LuCif3R
 */
public class Borrower {
    String borrowerId;
    int ISbn;
    String BookName;
    String BorrowersName;
    
    
    void setBorrower(String borrowID , String Bookname , String BorowName,int Isbn){
    
        this.BookName = Bookname;
        this.BorrowersName = BorowName;
        this.ISbn = Isbn;
        this.borrowerId = borrowID;
        
    }
    void StoreBorrowerRecord(int para1,String para2, String para3){
    
    
    
    
    }
    void display_borrowed_record(){
    
        
        
    
    }
    void updateStatus(){
    
    
    
    }
    
    
}
