/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountPackage.DataManupulation;

import com.sun.org.apache.xpath.internal.operations.Bool;
import java.io.Serializable;

/**
 *
 * @author Vanni Kotiyaa
 */
public class Payment extends Cash implements Serializable {

    /**
     * @return the paymentID
     */
    private String paymentID;
    private String paymentType;
    private String paymenAmount;
    private boolean isSuccessfull;

    public Payment() {
        this.isSuccessfull = false;
    }

    public String getPaymentID() {
        return paymentID;
    }

    /**
     * @param paymentID the paymentID to set
     */
    public void setPaymentID(String paymentID) {
        this.paymentID = paymentID;
    }

    /**
     * @return the paymentType
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * @param paymentType the paymentType to set
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * @return the paymenAmount
     */
    public double getPaymenAmount() {
        return getAmount();
    }

    /**
     * @param paymenAmount the paymenAmount to set
     */
    public void setPaymenAmount(String paymenAmount) {
        this.paymenAmount = paymenAmount;
    }

    /**
     * @return the isSuccessfull
     */
    public boolean isIsSuccessfull() {
        return isSuccessfull;
    }

    /**
     * @param isSuccessfull the isSuccessfull to set
     */
    public void setIsSuccessfull(boolean isSuccessfull) {
        this.isSuccessfull = isSuccessfull;
    }

    public Payment getIsSuccessfull() {
        if (isIsSuccessfull() == true) {
            return this;
        }
        return null;
    }

}
