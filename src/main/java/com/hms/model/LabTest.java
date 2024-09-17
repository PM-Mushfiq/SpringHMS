
package com.hms.model;
//import javax.persistence.Entity;
import jakarta.persistence.*;

/**
 *
 * @author Muhammad Mushfiq at SIMEC Systems
 */

@Entity
public abstract class LabTest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
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
