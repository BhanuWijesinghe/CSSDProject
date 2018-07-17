/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TicketMachineSystem;

import GUI.LoginClass;

/**
 *
 * @author Shakuni
 */
public class TicketMachineClass {
    
    public boolean login( String Username,String Password){
       boolean value = false;
       LoginClass loginClass = new LoginClass();
       value = loginClass.validateInputs(Username, Password);
       if(value==true){
           return true;
       }
       else{
           return false;
       }   
    }
}
