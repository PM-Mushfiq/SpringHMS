
package com.hms.model;

import jakarta.persistence.Entity;

/**
 *
 * @author Muhammad Mushfiq at SIMEC Systems
 */

@Entity
public abstract class LabTest {
    protected String title;
    protected double cost;
    protected boolean isAvailable;
    //protected String labTestType;
    
    public LabTest() {}
    public LabTest(String title,
                    double cost,
                    boolean isAvailable){
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable; 
    }
    
    public String toString(){
        String output = "Test name: "+this.title+"\n"
                + "Cost: "+this.cost+"\n"
                + "Availability: "+this.isAvailable;
        return output;
    }
    
    //public abstract boolean deliverReport();

}
