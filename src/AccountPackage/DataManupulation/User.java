/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountPackage.DataManupulation;

import java.io.Serializable;

/**
 *
 * @author Vanni Kotiyaa
 */
public class User implements Serializable{

    /**
     * @return the userId
     */
     private String userName;
     private String userId ;
     
     private String gender ;
     private int contactNumber ;
     private String email ;
     private String address ;
     private String city ;
     private String postalCode ;
    
    
    public String getUserId() {
        return userId;
    }

    /**
     * @return the password
     */
    

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @return the contactNumber
     */
    public int getContactNumber() {
        return contactNumber;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @return the postalCode
     */
    public String getPostalCode() {
        return postalCode;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }
    
   
     
     
   public void setUserName(String userNames) {
        this.userName = userNames;
    }
   
   public void setUserId(String userIds) {
        this.userId = userIds;
    }
   
   public void setGender(String genders) {
        this.gender = genders;
    }  
   public void setContactNumber(int contactNumbers) {
        this.contactNumber = contactNumbers;
    }
   public void setEmail(String emails) {
        this.email = emails;
    }
   public void setAddress(String addresss) {
        this.address = addresss;
    }
   public void setCity(String citys) {
        this.city = citys;
    }
   public void setPostalCode(String postalCodess) {
        this.postalCode = postalCodess;
    }
   
     
}
