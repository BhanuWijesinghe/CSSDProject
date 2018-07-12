/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccountPackage.DataManupulation;

/**
 *
 * @author Vanni Kotiyaa
 */
public class Cash  {

    /**
     * @return the value
     */
    private double value;
    private double change;
    
    public double getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(double value) {
        this.value = value;
    }

    /**
     * @return the change
     */
    public double getChange() {
        return change;
    }

    /**
     * @param change the change to set
     */
    public void setChange(double change) {
        this.change = change;
    }
    
    public double getAmount(){
        return (getValue()-getChange());
    }
   

    
}
