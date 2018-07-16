/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Route;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Shakuni
 */
public class RouteClass {
    ArrayList<Route> routeList = new ArrayList<Route> () ;
    public void routeSerialization (Route route) {
        try{  
            FileOutputStream routeFileOut = new FileOutputStream("Route.txt",true) ;
            ObjectOutputStream outputStream = new ObjectOutputStream (routeFileOut);
            outputStream.writeObject(route);
            
            outputStream.close();
            routeFileOut.close();
            
        }catch(IOException i){
        
            i.printStackTrace();
        }      
    }
    public ArrayList routeDeserialization (){
        try{   
            FileInputStream routeFileInput = new FileInputStream ("Route.txt");
            while(routeFileInput.available()> 0 ){
                ObjectInputStream routeInput = new ObjectInputStream (routeFileInput);
                Route route = (Route) routeInput.readObject(); 
                if(route != null){
                    routeList.add(route);
                }
            }
        }catch(Exception e){
            //JOptionPane.showMessageDialog(null, e);
           e.printStackTrace();
        }
        return routeList;
    }
}
