/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaymentPackage.Data;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
//import AccountPackage.DataManupulation.User;

/**
 *
 * @author Bhanu Wijesinghe
 */
public class DataSerial {
    
    ArrayList<Deals> dealList = new ArrayList<Deals> () ;
    ArrayList<Tokens> tokenList = new ArrayList<Tokens>();
    ArrayList<Tickets> ticketList = new ArrayList<Tickets>();
    
    //serializtion Deals
    public void DealSerialization (Deals deal) {
    
        try{
            
            FileOutputStream dealFileOut = new FileOutputStream("Deals.txt",true) ;
            ObjectOutputStream outputStream = new ObjectOutputStream (dealFileOut);
            outputStream.writeObject(deal);
            
            outputStream.close();
            dealFileOut.close();
            
        }catch(IOException i){
        
            i.printStackTrace();
        }      
    
    }
    
    //-------------------------------
    
    public void token1Serialization (Tokens token) {
    
        try{
            
            FileOutputStream token1FileOut = new FileOutputStream("Token1.txt",true) ;
            ObjectOutputStream outputStream = new ObjectOutputStream (token1FileOut);
            outputStream.writeObject(token);
            
            outputStream.close();
            token1FileOut.close();
            
        }catch(IOException i){
        
            i.printStackTrace();
        }      
    
    }
    
    // Desearlaization deal
    
    public ArrayList dealDeserialization (){
        
        try{
            
            FileInputStream dealFileInput = new FileInputStream ("Deals.txt");
            while(dealFileInput.available()> 0 ){
                ObjectInputStream dealInput = new ObjectInputStream (dealFileInput);
                Deals deal = (Deals) dealInput.readObject();
                
                if(deal != null){
                    dealList.add(deal);
                
                }
            }
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
    
        return dealList;
    }
     
 public ArrayList token1Deserialization (){
        
        try{
            
            FileInputStream token1FileInput = new FileInputStream ("Token1.txt");
            while(token1FileInput.available()> 0 ){
                ObjectInputStream token1Input = new ObjectInputStream (token1FileInput);
                Tokens token = (Tokens) token1Input.readObject();
                
                if(token != null){
                    tokenList.add(token);
                
                }
            }
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
    
        return tokenList;
    }
     
}