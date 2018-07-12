/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cssdtransportsystem.TokenMachine;
import cssdtransportsystem.TokenMachine.Payment;
/**
 *
 * @author Shakuni
 */
public class TokenMachineClass {
    public static void main(String[] args) {
        
    }
    public void login( String Username,String Password){
       
    }
    public void login (int verification_Code){
        
    }
    public boolean logout(){
        return true;
    }
    public String searchJourneys(String Source, String Location){
        return null;
    }
    public String buyToken( Payment Payment,String Source, String Location, String date, String Time){
        return null;
    }
    public String buyToken( Payment Payment,Account Account, String Source, String Location, String date, String Time){
        return null;
    }
    public Token issueToken(){
        return null;
    }
    public void setLoggedInAccount(){
        
    }
    public void acceptCash(){
    }
    public boolean validateCashPatment(Payment Payment){
        return true;
    }
    public Payment createPaymentObject(){
        return null;
    }
    public void editTokenMachine(){
    }
    
}
