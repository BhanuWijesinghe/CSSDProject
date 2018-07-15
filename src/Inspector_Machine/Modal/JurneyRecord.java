/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inspector_Machine.Modal;

import java.io.Serializable;
import java.sql.Time;
import java.util.Date;

/**
 *
 * @author hp
 */
public class JurneyRecord implements Serializable {

    String sourceStop;
    String destinationStop;
    Object[] stops;
    Date date;
    Time time;
    String transportType;
    double cost;

    void lookupCost() {

    }
}
