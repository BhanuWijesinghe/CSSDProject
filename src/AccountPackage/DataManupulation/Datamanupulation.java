/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountPackage.DataManupulation;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
//import AccountPackage.DataManupulation.User;

/**
 *
 * @author Vanni Kotiyaa
 */
public class Datamanupulation {
    
    ArrayList<User> userList = new ArrayList<User> () ;
    
    //serializtion user
    public void userSerialization (User user) {
    
        try{
            
            FileOutputStream userFileOut = new FileOutputStream("User.txt",true) ;
            ObjectOutputStream outputStream = new ObjectOutputStream (userFileOut);
            outputStream.writeObject(user);
            
            outputStream.close();
            userFileOut.close();
            
        }catch(IOException i){
        
            i.printStackTrace();
        }      
    
    }
    
    //-------------------------------
    
    // Desearlaization member
    
    public ArrayList userDeserialization (){
        
        try{
            
            FileInputStream userFileInput = new FileInputStream ("User.txt");
            while(userFileInput.available()> 0 ){
                ObjectInputStream userInput = new ObjectInputStream (userFileInput);
                User user = (User) userInput.readObject();
                
                if(user != null){
                    userList.add(user);
                
                }
            }
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
    
        return userList;
    }
     
    
}
