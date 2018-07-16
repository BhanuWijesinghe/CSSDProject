/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Route.Zones;

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
public class ZonesClass {
    ArrayList<Zones> zonesList = new ArrayList<Zones> () ;
    
    public void zonesSerialization (Zones zones) {
    
        try{
            
            FileOutputStream zonesFileOut = new FileOutputStream("Zones.txt",true) ;
            ObjectOutputStream outputStream = new ObjectOutputStream (zonesFileOut);
            outputStream.writeObject(zones);
            
            outputStream.close();
            zonesFileOut.close();
            
        }catch(IOException i){
        
            i.printStackTrace();
        }      
    
    }
    public ArrayList zonesDeserialization (){
        try{
            FileInputStream zonesFileInput = new FileInputStream ("Zones.txt");
            while(zonesFileInput.available()> 0 ){
                ObjectInputStream zonesInput = new ObjectInputStream (zonesFileInput);
                Zones zones = (Zones) zonesInput.readObject();
                
                if(zones != null){
                    zonesList.add(zones);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    
        return zonesList;
    }
}
