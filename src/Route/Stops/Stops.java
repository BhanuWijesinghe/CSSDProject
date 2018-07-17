/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Route.Stops;

import java.io.Serializable;

/**
 *
 * @author Shakuni
 */
public class Stops implements Serializable{
    
    private String StopID;
    private String ZoneID;
    private String Name;
    private float Latitude;
    private float Longitude;
    
    public void setStopDetails(String stopid, String zoneid, String name, float latitude, float longitude){
        setStopID(stopid);
        setZoneID(zoneid);
        setName(name);
        setLatitude(latitude);
        setLongitude(longitude);
    }
    
    
    public String getStopID() {
        return StopID;
    }

    public void setStopID(String StopID) {
        this.StopID = StopID;
    }

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

    public float getLatitude() {
        return Latitude;
    }

    public void setLatitude(float Latitude) {
        this.Latitude = Latitude;
    }

    public float getLongitude() {
        return Longitude;
    }

    public void setLongitude(float Longitude) {
        this.Longitude = Longitude;
    }
    
}
