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
    ArrayList<Account> accountList = new ArrayList<Account>();
    ArrayList<Employee> employeeList = new ArrayList<Employee>();
    
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
    
    public void accountSerialization (Account account) {
    
        try{
            
            FileOutputStream accountFileOut = new FileOutputStream("Account.txt",true) ;
            ObjectOutputStream outputStream = new ObjectOutputStream (accountFileOut);
            outputStream.writeObject(account);
            
            outputStream.close();
            accountFileOut.close();
            
        }catch(IOException i){
        
            i.printStackTrace();
        }      
    
    }
    
    //-------------------------------
     public void employeeSerialization (Employee employee) {
    
        try{
            
            FileOutputStream employeeFileOut = new FileOutputStream("Employee.txt",true) ;
            ObjectOutputStream outputStream = new ObjectOutputStream (employeeFileOut);
            outputStream.writeObject(employee);
            
            outputStream.close();
            employeeFileOut.close();
            
        }catch(IOException i){
        
            i.printStackTrace();
        }      
    
    }
    
    
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
     
 public ArrayList accountDeserialization (){
        
        try{
            
            FileInputStream accountFileInput = new FileInputStream ("Account.txt");
            while(accountFileInput.available()> 0 ){
                ObjectInputStream accountInput = new ObjectInputStream (accountFileInput);
                Account accounts = (Account) accountInput.readObject();
                
                if(accounts != null){
                    accountList.add(accounts);
                
                }
            }
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
    
        return accountList;
    }
     
public ArrayList employeeDeserialization (){
        
        try{
            
            FileInputStream employeeFileInput = new FileInputStream ("Employee.txt");
            while(employeeFileInput.available()> 0 ){
                ObjectInputStream employeeInput = new ObjectInputStream (employeeFileInput);
                Employee employee = (Employee) employeeInput.readObject();
                
                if(employee != null){
                    employeeList.add(employee);
                
                }
            }
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
    
        return employeeList;
    }
     
    
    
}
