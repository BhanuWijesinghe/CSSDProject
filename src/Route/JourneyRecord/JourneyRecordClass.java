/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Route.JourneyRecord;

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
public class JourneyRecordClass {
    ArrayList<JourneyRecord> journeyList = new ArrayList<JourneyRecord> () ;
    
    public void journeyRecordSerialization (JourneyRecord journeyRecord) {
    
        try{
            FileOutputStream journeyRecordFileOut = new FileOutputStream("JourneyRecord.txt",true) ;
            ObjectOutputStream outputStream = new ObjectOutputStream (journeyRecordFileOut);
            outputStream.writeObject(journeyRecord);
            outputStream.close();
            journeyRecordFileOut.close(); 
        }catch(IOException i){
            i.printStackTrace();
        }      
    }
    public ArrayList journeyRecordDeserialization (){
        
        try{
            FileInputStream journeyRecordFileInput = new FileInputStream ("JourneyRecord.txt");
            while(journeyRecordFileInput.available()> 0 ){
                ObjectInputStream journeyRecordInput = new ObjectInputStream (journeyRecordFileInput);
                JourneyRecord journeyRecord = (JourneyRecord) journeyRecordInput.readObject();
                if(journeyRecord != null){
                    journeyList.add(journeyRecord);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        return journeyList;
    }
}
