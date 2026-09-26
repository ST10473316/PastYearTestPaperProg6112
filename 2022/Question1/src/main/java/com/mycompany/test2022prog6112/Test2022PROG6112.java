/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test2022prog6112;
import java.util.Scanner;

/**
 *
 * @author sonav
 */
public class Test2022PROG6112 {

    public static void main(String[] args) {
        // 2D array: rows = months, columns = categories (Bathroom, Kitchen, Garden)
        int[][] jobs = {
            {8, 2, 5}, // Jan
            {7, 4, 5}, // Feb
            {5, 5, 2}, // Mar
            {2, 2, 3}, // Apr
            {7, 7, 9}, // May
            {7, 8, 5}  // Jun
        };

        // 1D array for month names
        String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun"};

        // 1D array to store monthly totals
        int[] monthlyTotals = new int[months.length];

        // Table header
        System.out.printf("%-10s %-10s %-10s %-10s %-15s%n",
                "Month", "Bathroom", "Kitchen", "Garden", "Total Makeovers");

        System.out.println("----------------------------------------------------------------");

        // Loop through months
        for (int i = 0; i < jobs.length; i++) {
            int bathroom = jobs[i][0];
            int kitchen = jobs[i][1];
            int garden = jobs[i][2];

            // Calculate monthly total
            monthlyTotals[i] = bathroom + kitchen + garden;

            // Display row with stars if total >= 15
            String stars = (monthlyTotals[i] >= 15) ? "  ***" : "";

            System.out.printf("%-10s %-10d %-10d %-10d %-10d %s%n",
                    months[i], bathroom, kitchen, garden, monthlyTotals[i], stars);
        }

        System.out.println("----------------------------------------------------------------");

        // Calculate category totals
        int totalBathroom = 0, totalKitchen = 0, totalGarden = 0, grandTotal = 0;
        for (int i = 0; i < jobs.length; i++) {
            totalBathroom += jobs[i][0];
            totalKitchen += jobs[i][1];
            totalGarden += jobs[i][2];
            grandTotal += monthlyTotals[i];
        }

        // Display totals
        System.out.printf("%-10s %-10d %-10d %-10d %-10d%n",
                "TOTAL", totalBathroom, totalKitchen, totalGarden, grandTotal);
    }
}
    