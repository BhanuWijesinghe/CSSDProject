/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Route.TransportVehicle;

import java.io.Serializable;


/**
 *
 * @author Shakuni
 */
public class Vehicle implements Serializable{
    
    private String VehicleID;
    private int Capacity;
    
    public String getVehicleID() {
        return VehicleID;
    }

    public void setVehicleID(String VehicleID) {
        this.VehicleID = VehicleID;
    }

    public int getCapacity() {
        return Capacity;
    }

    public void setCapacity(int Capacity) {
        this.Capacity = Capacity;
    }
    public void setVehicle(String vehicleID, int capacity){
        setVehicleID(vehicleID);
        setCapacity(capacity);
    }
    
    
}
