/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inspector_Machine.Modal;

import AccountPackage.DataManupulation.Transaction_Record;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author hp
 */
public class Token implements Serializable {

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

    private int tokenId;
    private String sourceStop;
    private String destStop;
    private Date dateOfJouney;
    private Time timeOfJourney;
    private Transaction_Record transaction;

    /**
     * @return the tokenId
     */
    public int getTokenId() {
        return tokenId;
    }

    /**
     * @param tokenId the tokenId to set
     */
    public void setTokenId(int tokenId) {
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
    public Date getDateOfJouney() {
        return dateOfJouney;
    }

    /**
     * @param dateOfJouney the dateOfJouney to set
     */
    public void setDateOfJouney(Date dateOfJouney) {
        this.dateOfJouney = dateOfJouney;
    }

    /**
     * @return the timeOfJourney
     */
    public Time getTimeOfJourney() {
        return timeOfJourney;
    }

    /**
     * @param timeOfJourney the timeOfJourney to set
     */
    public void setTimeOfJourney(Time timeOfJourney) {
        this.timeOfJourney = timeOfJourney;
    }

}
