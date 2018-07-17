/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Route.Zones;

import java.io.Serializable;

/**
 *
 * @author Shakuni
 */
public class Zones implements Serializable{
    
    private String ZoneID;
    private String Name;
    
    public String getZoneID() {
        return ZoneID;
    }

    public void setZoneID(String ZoneID) {
        this.ZoneID = ZoneID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    public void setZones(String zoneID, String name){
        setZoneID(zoneID);
        setName(name);
    }
    
}
