/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TokenMachine;

import AccountPackage.DataManupulation.User;
import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author Shakuni
 */
class Account {
    ArrayList<User> userList = new ArrayList<User> () ;
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
