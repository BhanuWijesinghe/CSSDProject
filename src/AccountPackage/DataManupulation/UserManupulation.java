/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountPackage.DataManupulation;

import java.io.Serializable;
import java.io.*;
import AccountPackage.DataManupulation.Datamanupulation;

/**
 *
 * @author Vanni Kotiyaa
 */
public class UserManupulation implements Serializable {
    
    public void addUser(User user){
        
        Datamanupulation addUser =new Datamanupulation();
        addUser.userSerialization(user );
    
    }
    
//    public void showUser(User user){
//        
//        Datamanupulation showUser =new Datamanupulation();
//        showUser.userSerialization(user );
//    
//    }
    
}
