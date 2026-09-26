/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pasttestpapers;
import java.util.Scanner;

/**
 *
 * @author sonav
 */
public class PastTestPapers {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Single-dimensional array containing the city names
        String[] cities = {
            "Cape Town",
            "Johannesburg",
            "Port Elizabeth"
        };

        // Two-dimensional array
        // Column 0 = Car accidents
        // Column 1 = Motor Bike accidents
        int[][] accidents = new int[3][2];

        // Ask the user to enter accident information
        for (int r = 0; r < cities.length; r++) {

            System.out.println("\nEnter accident information for "
                    + cities[r]);

            System.out.print("Enter number of car accidents: ");
            accidents[r][0] = scanner.nextInt();

            System.out.print("Enter number of motor bike accidents: ");
            accidents[r][1] = scanner.nextInt();
        }

        // Variables for finding the city with the highest total
        int highestTotal = 0;
        String highestCity = "";

        // Display report heading
        System.out.println("\n\nROAD ACCIDENT REPORT");
        System.out.println("------------------------------------------");

        System.out.printf("%-20s %-10s %-12s %-10s%n",
                "City", "Car", "Motor Bike", "Total");

        System.out.println("------------------------------------------");

        // Display the report and calculate totals
        for (int r = 0; r < accidents.length; r++) {

            // Calculate total accidents for the city
            int total = accidents[r][0] + accidents[r][1];

            // Display the information
            System.out.printf("%-20s %-10d %-12d %-10d%n",
                    cities[r],
                    accidents[r][0],
                    accidents[r][1],
                    total);

            // Check if this is the highest total
            if (total > highestTotal) {
                highestTotal = total;
                highestCity = cities[r];
            }
        }

        System.out.println("------------------------------------------");

        // Display city with highest number of accidents
        System.out.println("City with the highest number of accidents: "
                + highestCity);

        System.out.println("Highest total number of accidents: "
                + highestTotal);

        scanner.close();
    }
}