/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.hms.model;

/**
 *
 * @author Mushfiq
 */
public class RadiologicalTest extends LabTest{// implements TestReport, CostCalculation{
//    private String title;
//    private double cost;
//    private boolean isAvailable;
    private String plateDimention;  
    
    public RadiologicalTest(String title,
                    double cost,
                    boolean isAvailable,
                    String plateDimention){
        this.title = title;
        this.cost = cost;
        this.isAvailable = isAvailable; 
        this.plateDimention = plateDimention;
    }
   
    public String returnTestInfo(){
        String output = "Test name: "+this.title+"\n"
                + "Cost: "+this.cost+"\n"
                + "Plate Dimention: "+this.plateDimention+"\n"
                + "Availability: "+this.isAvailable+"\n";
        return output;
    }
//    void search(String title){
//        if(this.title == title)
//            returnLabTestInfo();
//        else
//            System.out.println("Not found");
//    }

//    @Override
    public double calcCost() {
        double totalCost=0;
        
        return totalCost;
    }
//    @Override
    public boolean deliverReport() {
        return false;
    }
}
