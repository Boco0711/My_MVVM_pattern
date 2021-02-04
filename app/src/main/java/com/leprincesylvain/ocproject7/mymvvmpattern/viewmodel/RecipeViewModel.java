package com.leprincesylvain.ocproject7.mymvvmpattern.viewmodel;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import com.leprincesylvain.ocproject7.mymvvmpattern.model.Recipe;
import com.leprincesylvain.ocproject7.mymvvmpattern.model.RecipeRepository;

import java.util.List;

public class RecipeViewModel extends AndroidViewModel {
    private RecipeRepository recipeRepository;
    private LiveData<List<Recipe>> allRecipes;

    public RecipeViewModel(@NonNull Application application) {
        super(application);
        recipeRepository = new RecipeRepository(application);
        allRecipes = recipeRepository.getAllRecipes();
    }

    public void insert(Recipe recipe) {
        recipeRepository.insert(recipe);
    }

    public void update(Recipe recipe) {
        recipeRepository.update(recipe);
    }

    public void delete(Recipe recipe) {
        recipeRepository.delete(recipe);
    }

    public void deleteAllRecipes() {
        recipeRepository.deleteAllRecipes();
    }

    public LiveData<List<Recipe>> getAllRecipes() {
        return allRecipes;
    }
}
