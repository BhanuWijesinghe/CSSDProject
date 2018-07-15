/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inspector_Machine.Modal;

import java.io.Serializable;

/**
 *
 * @author hp
 */
public class Route implements Serializable{

    int routeId;
    String name;
    Object[] stops;
    Object[] journeys;
    Object[] vehicles;

    void validateRoute() {

    }

    void searchRouteForJourney(String source, String destination) {

    }
}
