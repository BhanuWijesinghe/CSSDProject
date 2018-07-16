/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Route;

import java.io.Serializable;

/**
 *
 * @author Shakuni
 */
public class Route implements Serializable{
    
    private String RouteID;
    private String Name;
    private Object[][] Stops;
    private Object[][] Journeys;
    private Object[][] Vehicles;
    
    public String getRouteID() {
        return RouteID;
    }

    public void setRouteID(String RouteID) {
        this.RouteID = RouteID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public Object[][] getStops() {
        return Stops;
    }

    public void setStops(Object[][] Stops) {
        this.Stops = Stops;
    }

    public Object[][] getJourneys() {
        return Journeys;
    }

    public void setJourneys(Object[][] Journeys) {
        this.Journeys = Journeys;
    }

    public Object[][] getVehicles() {
        return Vehicles;
    }

    public void setVehicles(Object[][] Vehicles) {
        this.Vehicles = Vehicles;
    }
    public void setRoute(String routeID, String name, Object[][] stops, Object[][] journeys, Object[][] vehicle){
        setRouteID(routeID);
        setName(name);
        setStops(stops);
        setJourneys(journeys);
        setVehicles(vehicle);
    }
    public void validateRoute(){}
    public String searchRouteForJourney(String Source, String Destination){
        return null;
    }
    
}
