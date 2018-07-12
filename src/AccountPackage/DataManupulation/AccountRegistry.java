/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountPackage.DataManupulation;

/**
 *
 * @author Vanni Kotiyaa
 */
public class AccountRegistry {

    /**
     * @return the numberOfAccounts
     */
    
    private String numberOfAccounts;
    private Account accounts[]=null;
    
    public String getNumberOfAccounts() {
        return numberOfAccounts;
    }

    /**
     * @param numberOfAccounts the numberOfAccounts to set
     */
    public void setNumberOfAccounts(String numberOfAccounts) {
        this.numberOfAccounts = numberOfAccounts;
    }

    /**
     * @return the account
     */
    public Account[] getAccount() {
        return accounts;
    }

    /**
     * @param account the account to set
     */
    public void setAccount(Account[] account) {
        this.accounts = account;
    }
    
    
    public Account findAccount (String username, String password){
        
        for(Account acc : accounts){
        
            if (acc.getUsername() == username){
                if(acc.getPassword() == password){
                    return acc;
                
                }
            }
        }
        return null;
    }
    
    public Boolean updateAccount(String username, String password,double balance){
        
        boolean val = false;
        
        Account updateaccount = this.findAccount(username,password);
        if(updateaccount.setBalance(balance)){
            val = true;
        
        }      
        return val;
    }
    
    public Account retriveAccount (String accountID){
        
        for(Account acc : accounts){
        
            if (acc.getAccountID()== accountID){
                return acc;
                
            }
        }
        return null;
    }
            
  
    
}
