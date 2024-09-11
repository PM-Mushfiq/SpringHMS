
package com.hms.model;

/**
 *
 * @author Mushfiq
 */
public class PathologicalTest extends LabTest{ //implements TestReport, CostCalculation{
//    private String title;
//    private double cost;
//    private boolean isAvailable;
    private String reagent;
    
    public PathologicalTest(){}
    public PathologicalTest(String title, double cost){
        this.title = title;
        this.cost = cost;
    }
    public PathologicalTest(String title, int cost){
        this.title = title;
        this.cost = cost;
    }
    public PathologicalTest(double cost, String name){
        this.title = name;
        this.cost = cost;
    }
    public PathologicalTest(String title,
                    double cost,
                    boolean isAvailable,
                    String reagent){
        super(title,cost,isAvailable); 
        this.reagent = reagent;
    }
    
    @Override
    public String toString(){
        String output = super.toString()+"\n"
                + "Reagent: "+this.reagent+"\n";
        return output;
    }

}
