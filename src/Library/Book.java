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
    private int ISBN;
    private String Book_name;
    private String Pub_Year;
    private String Language;
    private String Catagory_type;
    private int Quntity;
    private int available_number;
    private double Price;
    
    
    void add_Book(int pISbn, String pname ,String pubYear , String language,String Catogry,int pquntity,int num,double price1){
    
        this.ISBN = pISbn;
        this.Book_name = pname;
        this.Pub_Year = pubYear;
        this.Language = language;
        this.Catagory_type = Catogry;
        this.Quntity = pquntity;
        this.available_number = num;
        this.Price = price1;
    
    }
    
    public void stor_details(int pISbn, String pname ,String pubYear , String language,String Catogry,int pquntity,int num,double price1i){
    
    
    
        } 
        
    public void searchbook(String word){
    
        
        
    
    }
    public void remove_Book(int isbn){
    
    
    }
    public void update_book(int pISbn){
    
    
    
    }

    

}
