/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaymentPackage.Data;

/**
 *
 * @author Bhanu
 */
import AccountPackage.DataManupulation.Transaction_Record;
import java.io.Serializable;

/**
 *
 * @author hp
 */
public class Tokens implements Serializable {

    /**
     * @return the transaction
     */
    public Transaction_Record getTransaction() {
        return transaction;
    }

    /**
     * @param transaction the transaction to set
     */
    public void setTransaction(Transaction_Record transaction) {
        this.transaction = transaction;
    }

    private String tokenId;
    private String sourceStop;
    private String destStop;
    private String dateOfJouney;
    private String timeOfJourney;
    private Transaction_Record transaction;

    /**
     * @return the tokenId
     */
    public String getTokenId() {
        return tokenId;
    }

    /**
     * @param tokenId the tokenId to set
     */
    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    /**
     * @return the sourceStop
     */
    public String getSourceStop() {
        return sourceStop;
    }

    /**
     * @param sourceStop the sourceStop to set
     */
    public void setSourceStop(String sourceStop) {
        this.sourceStop = sourceStop;
    }

    /**
     * @return the destStop
     */
    public String getDestStop() {
        return destStop;
    }

    /**
     * @param destStop the destStop to set
     */
    public void setDestStop(String destStop) {
        this.destStop = destStop;
    }

    /**
     * @return the dateOfJouney
     */
    public String getDateOfJouney() {
        return dateOfJouney;
    }

    /**
     * @param dateOfJouney the dateOfJouney to set
     */
    public void setDateOfJouney(String dateOfJouney) {
        this.dateOfJouney = dateOfJouney;
    }

    /**
     * @return the timeOfJourney
     */
    public String getTimeOfJourney() {
        return timeOfJourney;
    }

    /**
     * @param timeOfJourney the timeOfJourney to set
     */
    public void setTimeOfJourney(String timeOfJourney) {
        this.timeOfJourney = timeOfJourney;
    }
//    public void setTransactionRecord(Transaction_Record transaction){
//        
//    }
    
    public void setTokens(String id,String source,String destination,String date, String time){
        setTokenId(id);
        setSourceStop(source);
        setDestStop(destination);
        setDateOfJouney(date);
        setTimeOfJourney(time);
    }
        
}