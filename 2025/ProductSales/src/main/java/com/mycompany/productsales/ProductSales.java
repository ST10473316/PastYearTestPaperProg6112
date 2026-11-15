/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.productsales;

/**
 *
 * @author sonav
 */
public class ProductSales implements IProductSales {

    // Product sales for two years
    private final int[][] productSales = {
        {300, 150, 700},
        {250, 200, 600}
    };

    // Sales limit
    private static final int SALES_LIMIT = 500;

    // Return product sales data
    @Override
    public int[][] GetProductSales() {
        return productSales;
    }

    // Calculate total sales
    @Override
    public int GetTotalSales() {
        int total = 0;

        for (int[] year : productSales) {
            for (int sale : year) {
                total += sale;
            }
        }

        return total;
    }

    // Count sales greater than 500
    @Override
    public int GetSalesOverLimit() {
        int count = 0;

        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale > SALES_LIMIT) {
                    count++;
                }
            }
        }

        return count;
    }

    // Count sales less than 500
    @Override
    public int GetSalesUnderLimit() {
        int count = 0;

        for (int[] year : productSales) {
            for (int sale : year) {
                if (sale < SALES_LIMIT) {
                    count++;
                }
            }
        }

        return count;
    }

    // Count the number of sales entries processed
    @Override
    public int GetProductsProcessed() {
        int count = 0;

        for (int[] year : productSales) {
            count += year.length;
        }

        return count;
    }

    // Calculate average sales
    @Override
    public double GetAverageSales() {
        int count = GetProductsProcessed();

        if (count == 0) {
            return 0;
        }

        // Complete using GetTotalSales() divided by count.
        // Use double division to retain decimal places.
        return (double) GetTotalSales() / count;
    }
}
