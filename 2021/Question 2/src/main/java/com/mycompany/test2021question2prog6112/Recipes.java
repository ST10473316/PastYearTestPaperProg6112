/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.test2021question2prog6112;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author sonav
 */
abstract class Recipes {
    protected List<String> ingredients;
    protected int timeToMake; // in minutes
    protected String difficultyLevel;

    public Recipes() {
        ingredients = new ArrayList<>();
    }

    // Abstract method to display recipe details
    public abstract void displayRecipe();

    // Method to add an ingredient
    public void addIngredient(String ingredient) {
        if (ingredient != null && !ingredient.trim().isEmpty()) {
            ingredients.add(ingredient.trim());
        }
    }

    // Setters with validation
    public void setTimeToMake(int time) {
        if (time > 0) {
            this.timeToMake = time;
        } else {
            throw new IllegalArgumentException("Time must be greater than zero.");
        }
    }

    public void setDifficultyLevel(String level) {
        if (level != null && !level.trim().isEmpty()) {
            this.difficultyLevel = level.trim();
        } else {
            throw new IllegalArgumentException("Difficulty level cannot be empty.");
        }
    }
}