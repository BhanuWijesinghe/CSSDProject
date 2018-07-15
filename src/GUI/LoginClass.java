/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import AccountPackage.DataManupulation.Account;
import AccountPackage.DataManupulation.Datamanupulation;
import AccountPackage.DataManupulation.Employee;
import AccountPackage.DataManupulation.User;
import java.sql.Array;
import java.util.ArrayList;

/**
 *
 * @author Vanni Kotiyaa
 */
public class LoginClass {

    /**
     * @return the userID
     */
    
    private String userID;
    private String password;
    
    ArrayList<User> userList = new ArrayList();
    ArrayList<Employee> employeeList = new ArrayList();
    ArrayList<Account> accountList = new ArrayList();
    
    public String getUserID() {
        return userID;
    }

    /**
     * @param userID the userID to set
     */
    public void setUserID(String userID) {
        this.userID = userID;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
    public ArrayList userDesearilized(){
    
        Datamanupulation dm = new Datamanupulation();
        ArrayList userlist=dm.userDeserialization();
        return userlist;
    }
    
    public ArrayList employeeDeserilized(){
    
        Datamanupulation dm2 = new Datamanupulation();
        ArrayList employeelist = dm2.employeeDeserialization();
        return employeelist;
    
    }
    
    public ArrayList accountDeserialized(){
        Datamanupulation dmp = new Datamanupulation();
        ArrayList accountlist = dmp.accountDeserialization();
        return accountlist;
    
    }
    
    public boolean validateInputs(String username, String password){
    
        userList = userDesearilized();
        employeeList = employeeDeserilized();
        accountList = accountDeserialized();
        
        for(Account acc:accountList){
         if((acc.getUsername().equals(username)) && (acc.getPassword().equals(password))){
             
             return true;
         }
         else{
           return false;
         }
        
        }
            
        
    return false;
    }
    
}
