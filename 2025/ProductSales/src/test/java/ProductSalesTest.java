/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.productsales;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 *
 * @author sonav
 */

public class ProductSalesTest {

    // ProductSales object used by the unit tests
    private ProductSales sales;

    /*
     * This method runs before every test.
     * A new ProductSales object is created so that
     * each test runs independently.
     */
    @BeforeEach
    public void setUp() {
        sales = new ProductSales();
    }

    /*
     * SALES OVER LIMIT
     * Tests whether the correct number of sales
     * greater than 500 is returned.
     */
    @Test
    public void GetSalesOverLimit_ReturnsNumberOfSales() {

        // The sales values above 500 are 700 and 600
        int expected = 2;

        // Call the method to calculate sales over the limit
        int result = sales.GetSalesOverLimit();

        // Verify that the method returns the expected value
        assertEquals(expected, result);
    }

    /*
     * SALES UNDER LIMIT
     * Tests whether the correct number of sales
     * less than 500 is returned.
     */
    @Test
    public void GetSalesUnderLimit_ReturnsNumberOfSales() {

        // The sales values below 500 are
        // 300, 150, 250 and 200
        int expected = 4;

        // Call the method to calculate sales under the limit
        int result = sales.GetSalesUnderLimit();

        // Verify that the method returns the expected value
        assertEquals(expected, result);
    }
}
