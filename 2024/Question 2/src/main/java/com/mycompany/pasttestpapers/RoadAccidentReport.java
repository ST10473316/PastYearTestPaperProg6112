/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasttestpapers;

/**
 *
 * @author sonav
 */
public class RoadAccidentReport extends RoadAccidents {

    // Constructor
    public RoadAccidentReport(String accidentVehicleType,
            String city, int accidentTotal) {

        super(accidentVehicleType, city, accidentTotal);
    }

    // Method to print the accident report
    public void printAccidentReport() {

        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("--------------------");

        System.out.println("Vehicle Type: "
                + getAccidentVehicleType());

        System.out.println("City: "
                + getCity());

        System.out.println("Number of Accidents: "
                + getAccidentTotal());
    }
}