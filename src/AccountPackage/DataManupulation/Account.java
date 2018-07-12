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
public class Account {

    /**
     * @return the accountID
     */
    private String accountID;
    private String card;
    private double balance;
    private String username;
    private String password;
    private Transaction_History transactionHistory;
    
    public String getAccountID() {
        return accountID;
    }

    /**
     * @return the card
     */
    public String getCard() {
        return card;
    }

    /**
     * @param balance the balance to set
     */
    public boolean setBalance(double balance) {
        this.balance = balance;
        return true;
    }

    /**
     * @return the username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @return the transactionHistory
     */
    public Transaction_History getTransactionHistory() {
        return transactionHistory;
    }
 
    
    public void setAccountID(String accountIDs) {
        this.accountID = accountIDs;
    }
    public void setCard(String cards) {
        this.card = cards;
    }
    public double getBalance() {
       return balance;
    }
    public void creditBalance(double credits) {
        this.setBalance(this.getBalance() + credits);
    }
    public void setUsername(String usernames) {
        this.username = usernames;
    }
    public void setPassword(String passwords) {
        this.password = passwords;
    }
    public void setTransactionHistory(Transaction_History transactionHistorys) {
        this.transactionHistory = transactionHistorys;
    }
    
    public boolean checkCredentials(String usernames, String passwords) {
        if(this.getUsername() == usernames){
            if(this.getPassword() == passwords){
                return true;
            }
        }
        else {
        return false;
        }
        
        return false;
    }
    
    public void debitBalance(double credits ) {
        this.setBalance(this.getBalance() - credits);
    }
    
    public Account getAccountDetails(String accountId){
         if(getAccountID()== accountId){
             return this;
         }
         return null;
    }
    
    public void setAccountDetails( String accountID,String username,String password){
           setAccountID(accountID);
//           setCard(card);
//           setBalance(balance);
           setUsername(username);
           setPassword(password);
//           setTransactionHistory(transactionHistory);




    }
    
   
//    public void topUpAccountBalance(double Payments,String Machine_ID ) {
//        this.setBalance(this.getBalance() - credits);
//    }
    
//    public void createTopUpTransactionRecord (double Payments,String Account_ID,String Machine_ID) {
//        this.setTransactionHistory(transaction_Records);
//    }
}
