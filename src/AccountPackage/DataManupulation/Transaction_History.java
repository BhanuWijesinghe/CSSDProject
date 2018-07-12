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
public class Transaction_History {

    /**
     * @return the account_ID
     */
    private String account_ID;
    private Transaction_Record transactions[];
    private String transaction_History_ID;
    
    public String getAccount_ID() {
        return account_ID;
    }

    /**
     * @param account_ID the account_ID to set
     */
    public void setAccount_ID(String account_ID) {
        this.account_ID = account_ID;
    }

    /**
     * @return the transactions
     */
    public Transaction_Record[] getTransactions() {
        return transactions;
    }

    /**
     * @param transactions the transactions to set
     */
    public void setTransactions(Transaction_Record[] transactions) {
        this.transactions = transactions;
    }

    /**
     * @return the transaction_History_ID
     */
    public String getTransaction_History_ID() {
        return transaction_History_ID;
    }

    /**
     * @param transaction_History_ID the transaction_History_ID to set
     */
    public void setTransaction_History_ID(String transaction_History_ID) {
        this.transaction_History_ID = transaction_History_ID;
    }
   
}
