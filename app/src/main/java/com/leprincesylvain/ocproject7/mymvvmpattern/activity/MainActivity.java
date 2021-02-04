package com.leprincesylvain.ocproject7.mymvvmpattern.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;
import android.widget.Toast;

import com.leprincesylvain.ocproject7.mymvvmpattern.R;
import com.leprincesylvain.ocproject7.mymvvmpattern.model.Recipe;
import com.leprincesylvain.ocproject7.mymvvmpattern.viewmodel.RecipeViewModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecipeViewModel recipeViewModel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recipeViewModel = ViewModelProviders.of(this).get(RecipeViewModel.class);
        recipeViewModel.getAllRecipes().observe(this, new Observer<List<Recipe>>() {
            @Override
            public void onChanged(List<Recipe> recipes) {
                // update RecyclerView
                Toast.makeText(MainActivity.this, "On Changed", Toast.LENGTH_SHORT).show();
            }
        });
    }
}