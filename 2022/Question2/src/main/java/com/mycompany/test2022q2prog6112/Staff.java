/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test2022q2prog6112;

/**
 *
 * @author sonav
 */
// Abstract Staff class implementing iStaff
public abstract class Staff implements iStaff {

    protected int staffNumber;
    protected String staffLocation;

    // Constructor
    public Staff(int staffNumber, String staffLocation) {
        this.staffNumber = staffNumber;
        this.staffLocation = staffLocation;
    }

    // Get staff number
    @Override
    public int getStaffNumber() {
        return staffNumber;
    }

    // Get staff location
    @Override
    public String getStaffLocation() {
        return staffLocation;
    }

    // Get staff hiring process
    @Override
    public abstract String getStaffHiringProcess();
}