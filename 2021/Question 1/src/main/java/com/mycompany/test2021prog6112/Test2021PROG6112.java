/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test2021prog6112;

/**
 *
 * @author sonav
 */
public class Test2021PROG6112 {

    public static void main(String[] args) {
        // Months and years
        String[] months = {"JAN", "FEB", "MAR"};
        int[] years = {2018, 2019, 2020};

        // Hardcoded delivery data: rows = years, columns = months
        int[][] deliveries = {
            {128, 135, 139}, // 2018
            {155, 129, 175}, // 2019
            {129, 130, 18}   // 2020
        };

        // Display header
        System.out.println("***********************");
        System.out.println("    Delivery Report    ");
        System.out.println("***********************");
        System.out.printf("%-18s", "YEAR");
        for (String month : months) {
            System.out.printf("%-8s", month);
        }
        System.out.printf("%-8s", "TOTAL");
        System.out.println();

        // Variables for statistics
        int grandTotal = 0;
        int max = deliveries[0][0];
        int min = deliveries[0][0];

        // Display rows and calculate totals
        for (int i = 0; i < years.length; i++) {
            System.out.printf("%-18s", "DELIVERIES " + years[i]);
            int yearTotal = 0;
            for (int j = 0; j < months.length; j++) {
                int value = deliveries[i][j];
                System.out.printf("%-8d", value);
                yearTotal += value;
                grandTotal += value;
                if (value > max) max = value;
                if (value < min) min = value;
            }
            System.out.printf("%-8d", yearTotal);
            System.out.println();
        }

        // Display statistics
        System.out.println("");
        System.out.println("*******************************");
        System.out.println("\n    Deliveries Statistics    ");
        System.out.println("*******************************");
        System.out.println("Total Deliveries: " + grandTotal);
        System.out.println("Maximum Deliveries: " + max);
        System.out.println("Minimum Deliveries: " + min);
    }
}
