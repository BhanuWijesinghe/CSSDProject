/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountPackage.DataManupulation;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 *
 * @author Vanni Kotiyaa
 */
public class Datamanupulation {
    //serializtion
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
     
    
}
