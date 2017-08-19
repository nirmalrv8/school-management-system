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
public class Book {
    int ISBN;
    String Book_name;
    String Pub_Year;
    String Language;
    String Catagory_type;
    int Quntity;
    int available_number;
    double Price;
    
    
    void add_Book(int pISbn, String pname ,String pubYear , String language,String Catogry,int pquntity,int num,double price1 ){
    
        this.ISBN = pISbn;
        this.Book_name = pname;
        this.Pub_Year = pubYear;
        this.Language = language;
        this.Catagory_type = Catogry;
        this.Quntity = pquntity;
        this.available_number = num;
        this.Price = price1;
    
    }
    
    void stor_details(){
    
    
    
        } 
        
    void searchbook(String word){
    
        
        
    
    }
    void remove_Book(int isbn){
    
    
    }
    void update_book(int pISbn, String pname ,String pubYear , String language,String Catogry,int pquntity,int num,double price1){
    
    
    
    }
    

}
