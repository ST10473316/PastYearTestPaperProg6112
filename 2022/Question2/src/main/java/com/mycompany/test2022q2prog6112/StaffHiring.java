/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test2022q2prog6112;

/**
 *
 * @author sonav
 */
// StaffHiring subclass
class StaffHiring extends Staff {

    // Constructor
    public StaffHiring(int staffNumber, String staffLocation) {
        super(staffNumber, staffLocation);
    }

    // Implement hiring process logic
    @Override
    public String getStaffHiringProcess() {
        if (getStaffNumber() < 20) {
            return "Hiring process must start.";
        } else {
            return "No hiring needed.";
        }
    }

    // Method to print staff details and hiring decision
    public void printStaffHiring() {
        System.out.println("Staff Number: " + getStaffNumber());
        System.out.println("Staff Location: " + getStaffLocation());
        System.out.println("Hiring Decision: " + getStaffHiringProcess());
    }
}