/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inspector_Machine.Modal;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author hp
 */
public class InspectorMachine implements Serializable{
    
    int machineId;
    int employeeId;
    Object loggedInAccount;
    Object paymentCardReader;
    Object printer;
    
    void login(){
    
    }
    
    void logout(){
    
    }
    
    void issueToken(){
    }
    
    void issueFine(){
        
    }
    
    void createException(){
        
    }
    
    void searchJourneys(String source,String location){
        
    }
    
    void validateToken(){
        
    }
    
    void setLoggedInUser(){
        
    }
    
    void updateDisplay(){
        
    }
    
    void buyToken(double payment,String source,String destination,Date date,Time time){
        
    }
    
    void createPaymentObject(){
        
    }
}
