package com.leprincesylvain.ocproject7.mymvvmpattern.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "recipe_table")
public class Recipe {

    // Entity -> https://developer.android.com/training/data-storage/room/defining-data

    @PrimaryKey(autoGenerate = true)
    private int recipeId;
    private String recipeName;
    private int recipeDifficulty;
    private int recipeLong;

    public Recipe(String recipeName, int recipeDifficulty, int recipeLong) {
        this.recipeName = recipeName;
        this.recipeDifficulty = recipeDifficulty;
        this.recipeLong = recipeLong;
    }

    public int getRecipeId() {
        return recipeId;
    }

    public String getRecipeName() {
        return recipeName;
    }

    public int getRecipeDifficulty() {
        return recipeDifficulty;
    }

    public int getRecipeLong() {
        return recipeLong;
    }

    public void setRecipeId(int recipeId) {
        this.recipeId = recipeId;
    }
}
