/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Route.JourneyRecord;

import Route.Stops.Stops;
import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author Shakuni
 */
public class JourneyRecord implements Serializable{

    private String Source_Stop;
    private String Destination_Stops;
    //private Stops stops;
    private Object[][] row;
    private String Date;
    private String Time;
    private String Transport_Type;
    private int Cost;
    
    public String getSource_Stop() {
        return Source_Stop;
    }

    public void setSource_Stop(String Source_Stop) {
        this.Source_Stop = Source_Stop;
    }

    public String getDestination_Stops() {
        return Destination_Stops;
    }

    public void setDestination_Stops(String Destination_Stops) {
        this.Destination_Stops = Destination_Stops;
    }
    public Object[][] getRow() {
        return row;
    }

    //private Stops Stops;
    public void setRow(Object[][] row) {
        this.row = row;
    }
//    public Stops getStops() {
//        return Stops;
//    }
//
//    public void setStops(Stops Stops) {
//        this.Stops = Stops;
//    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        this.Date = date;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        this.Time = time;
    }

    public String getTransport_Type() {
        return Transport_Type;
    }

    public void setTransport_Type(String Transport_Type) {
        this.Transport_Type = Transport_Type;
    }

    public int getCost() {
        return Cost;
    }

    public void setCost(int Cost) {
        this.Cost = Cost;
    }
    public void setJourney(String sourceStop, String destinationStop, Object[][] stop, String date, String time, String transportType, int cost){
        setSource_Stop(sourceStop);
        setDestination_Stops(destinationStop);
        setRow(stop);
        //setStops(stop);
        setDate(date);
        setTime(time);
        setTransport_Type(transportType);
        setCost(cost);
    }
    public void lookUpCost(){
    }
}
