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
public class Transaction_Record {

    /**
     * @return the transaction_ID
     */
    private String transaction_ID;
    private String account_ID;
    private String token;
    private String dateOfPurchase;
    private String timeOfPurchase;
    private String transactionType;
    private String purchaseLocation;
    private Payment payment;
    
    public String getTransaction_ID() {
        return transaction_ID;
    }

    /**
     * @param transaction_ID the transaction_ID to set
     */
    public void setTransaction_ID(String transaction_ID) {
        this.transaction_ID = transaction_ID;
    }

    /**
     * @return the account_ID
     */
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
     * @return the token
     */
    public String getToken() {
        return token;
    }

    /**
     * @param token the token to set
     */
    public void setToken(String token) {
        this.token = token;
    }

    /**
     * @return the dateOfPurchase
     */
    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    /**
     * @param dateOfPurchase the dateOfPurchase to set
     */
    public void setDateOfPurchase(String dateOfPurchase) {
        this.dateOfPurchase = dateOfPurchase;
    }

    /**
     * @return the timeOfPurchase
     */
    public String getTimeOfPurchase() {
        return timeOfPurchase;
    }

    /**
     * @param timeOfPurchase the timeOfPurchase to set
     */
    public void setTimeOfPurchase(String timeOfPurchase) {
        this.timeOfPurchase = timeOfPurchase;
    }

    /**
     * @return the transactionType
     */
    public String getTransactionType() {
        return transactionType;
    }

    /**
     * @param transactionType the transactionType to set
     */
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    /**
     * @return the purchaseLocation
     */
    public String getPurchaseLocation() {
        return purchaseLocation;
    }

    /**
     * @param purchaseLocation the purchaseLocation to set
     */
    public void setPurchaseLocation(String purchaseLocation) {
        this.purchaseLocation = purchaseLocation;
    }

    /**
     * @return the payment
     */
    public Payment getPayment() {
        return payment;
    }

    /**
     * @param payment the payment to set
     */
    public void setPayment(Payment payment) {
        this.payment = payment;
    }
    
    
    
    
    
}
