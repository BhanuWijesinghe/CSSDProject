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
public class Tickets implements Serializable {
    
    private String ticketID;
    private String time;
    private String source;
    private String destination;
    private String date;
    private double totalPrice;
    private String userID;
    
    public String getTicketID() {
        return ticketID;
    }
    
    public String getTime() {
        return time;
    }
    public String getSource() {
        return source;
    }
    public String getDestination() {
        return destination;
    }
    public String getDate() {
        return date;
    }
    public Double getPrice() {
        return totalPrice;
    }
    public String getUser() {
        return userID;
    }
    public void setTicketID(String tID) {
        this.ticketID = tID;
    }
    
    public void setTime(String t) {
        this.time=t;
    }
    public void setSource(String src) {
        this.source=src;
    }
    public void setDestination(String dest) {
        this.destination=dest;
    }
    public void setDate(String day) {
        this.date=day;
    }
    public void setPrice(Double price) {
        this.totalPrice=price;
    }
    public void setUser(String id) {
        this.userID=id;
    }
    
}
