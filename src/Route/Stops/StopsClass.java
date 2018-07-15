/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Route.Stops;

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
public class StopsClass {
    ArrayList<Stops> stopsList = new ArrayList<Stops> () ;
    
    public void stopsSerialization (Stops stops) {
    
        try{
            
            FileOutputStream stopsFileOut = new FileOutputStream("Stops.txt",true) ;
            ObjectOutputStream outputStream = new ObjectOutputStream (stopsFileOut);
            outputStream.writeObject(stops);
            
            outputStream.close();
            stopsFileOut.close();
            
        }catch(IOException i){
        
            i.printStackTrace();
        }      
    
    }
    public ArrayList stopsDeserialization (){
        
        try{
            
            FileInputStream stopsFileInput = new FileInputStream ("Stops.txt");
            while(stopsFileInput.available()> 0 ){
                ObjectInputStream stopsInput = new ObjectInputStream (stopsFileInput);
                Stops stops = (Stops) stopsInput.readObject();
                
                if(stops != null){
                    stopsList.add(stops);
                
                }
            }
        
        
        }catch(Exception e){
            e.printStackTrace();
        }
    
        return stopsList;
    }
}
