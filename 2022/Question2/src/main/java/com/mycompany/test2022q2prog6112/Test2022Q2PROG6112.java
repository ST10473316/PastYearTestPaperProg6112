/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test2022q2prog6112;

/**
 *
 * @author sonav
 */
public class Test2022Q2PROG6112 {
    public static void main(String[] args) {
        try {
            // Example test values
            StaffHiring store1 = new StaffHiring(15, "Cape Town");
            StaffHiring store2 = new StaffHiring(25, "Johannesburg");

            System.out.println("=== Store 1 ===");
            store1.printStaffHiring();

            System.out.println("\n=== Store 2 ===");
            store2.printStaffHiring();

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}