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
    
    public void TicketsSerialization (Tickets ticket) {
    
        try{
            
            FileOutputStream ticketFileOut = new FileOutputStream("Tickets.txt",true) ;
            ObjectOutputStream outputStream = new ObjectOutputStream (ticketFileOut);
            outputStream.writeObject(ticket);
            
            outputStream.close();
            ticketFileOut.close();
            
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
     
 public ArrayList ticketDeserialization (){
        
        try{
            
            FileInputStream ticketFileInput = new FileInputStream ("Tickets.txt");
            while(ticketFileInput.available()> 0 ){
                ObjectInputStream ticketInput = new ObjectInputStream (ticketFileInput);
                Tickets ticket = (Tickets) ticketInput.readObject();
                
                if(ticket != null){
                    ticketList.add(ticket);
                
                }
            }
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
    
        return ticketList;
    }
     
}