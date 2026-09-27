/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.test2021question2prog6112;
import java.util.Scanner;

/**
 *
 * @author sonav
 */
public class Test2021Question2PROG6112 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BakingRecipe recipe = new BakingRecipe();

        System.out.println("=== Baking Recipe Capture ===");

        // Capture ingredients
        System.out.print("Enter number of ingredients: ");
        int numIngredients = 0;
        try {
            numIngredients = Integer.parseInt(scanner.nextLine());
            if (numIngredients <= 0) {
                System.out.println("Number of ingredients must be greater than zero.");
                return;
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid number entered.");
            return;
        }

        for (int i = 1; i <= numIngredients; i++) {
            System.out.print("Enter ingredient " + i + ": ");
            recipe.addIngredient(scanner.nextLine());
        }

        // Capture time to make
        try {
            System.out.print("Enter time to make (in minutes): ");
            recipe.setTimeToMake(Integer.parseInt(scanner.nextLine()));
        } catch (NumberFormatException e) {
            System.out.println("Invalid time entered.");
            return;
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        // Capture difficulty level
        System.out.print("Enter difficulty level (Easy, Medium, Hard): ");
        try {
            recipe.setDifficultyLevel(scanner.nextLine());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            return;
        }

        // Display recipe
        recipe.displayRecipe();

        scanner.close();
    }
}
