package com.hms.controller;

import com.hms.model.LabTest;

import java.util.*;

public class LabTestController {

    int aoiIndex, aosindex, aooIndex;
    //private PathologicalTest[] pathologicalTest; //= new PathologicalTest();


    private List<LabTest> labTests = new ArrayList<>();
    public void addLabTests(LabTest lt){
        labTests.add(lt);
    }
    public void showLabTests(){
        System.out.println(labTests.toString());
    }
    //Date d = new Date();
}
