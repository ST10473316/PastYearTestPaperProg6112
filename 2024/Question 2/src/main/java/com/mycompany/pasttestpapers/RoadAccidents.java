/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pasttestpapers;

/**
 *
 * @author sonav
 */
public abstract class RoadAccidents implements IRoadAccidents {

    // Variables
    private String accidentVehicleType;
    private String city;
    private int accidentTotal;

    // Constructor
    public RoadAccidents(String accidentVehicleType, String city, int accidentTotal) {
        this.accidentVehicleType = accidentVehicleType;
        this.city = city;
        this.accidentTotal = accidentTotal;
    }

    // Getter for vehicle type
    @Override
    public String getAccidentVehicleType() {
        return accidentVehicleType;
    }

    // Getter for city
    @Override
    public String getCity() {
        return city;
    }

    // Getter for accident total
    @Override
    public int getAccidentTotal() {
        return accidentTotal;
    }
}