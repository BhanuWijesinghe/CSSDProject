/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PaymentPackage.Data;

import java.io.Serializable;

/**
 *
 * @author Bhanu
 */
public class Deals implements Serializable{
    private String dealID;
    private String offerCriteria;
    private Double discount;
    
    public String getDealID(){
        return dealID;
    }
    public void setDealID(String id){
        this.dealID=id;
    }
    public String getOfferCriteria(){
        return offerCriteria;
    }
    public void setOfferCriteria(String criteria){
        this.offerCriteria=criteria;
    }
    public Double getDiscount(){
        return discount;
    }
    public void setDiscount(Double dis){
        this.discount=dis;
    }
    public void setDeals(String id,String criteria,Double discount){
        setDealID(id);
        setOfferCriteria(criteria);
        setDiscount(discount);
    }
}
