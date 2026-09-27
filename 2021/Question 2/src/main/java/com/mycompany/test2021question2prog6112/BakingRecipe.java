/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test2021question2prog6112;

/**
 *
 * @author sonav
 */
class BakingRecipe extends Recipes {

    @Override
    public void displayRecipe() {
        System.out.println("\n--- Baking Recipe Details ---");
        System.out.println("Ingredients:");
        for (int i = 0; i < ingredients.size(); i++) {
            System.out.println((i + 1) + ". " + ingredients.get(i));
        }
        System.out.println("Time to Make: " + timeToMake + " minutes");
        System.out.println("Difficulty Level: " + difficultyLevel);
    }
}