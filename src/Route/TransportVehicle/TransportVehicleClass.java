/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Route.TransportVehicle;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 *
 * @author Shakuni
 */
public class TransportVehicleClass {
    ArrayList<Vehicle> vehicleList = new ArrayList<Vehicle> () ;
    public void vehicleSerialization (Vehicle vehicle) {
        try{  
            FileOutputStream vehicleFileOut = new FileOutputStream("Vehicle.txt",true) ;
            ObjectOutputStream outputStream = new ObjectOutputStream (vehicleFileOut);
            outputStream.writeObject(vehicle);
            
            outputStream.close();
            vehicleFileOut.close();
            
        }catch(IOException i){
        
            i.printStackTrace();
        }      
    }
    public ArrayList vehicleDeserialization (){
        try{   
            FileInputStream vehicleFileInput = new FileInputStream ("Vehicle.txt");
            while(vehicleFileInput.available()> 0 ){
                ObjectInputStream vehicleInput = new ObjectInputStream (vehicleFileInput);
                Vehicle vehicle = (Vehicle) vehicleInput.readObject(); 
                if(vehicle != null){
                    vehicleList.add(vehicle);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return vehicleList;
    }
}
