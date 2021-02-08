package com.leprincesylvain.ocproject7.mymvvmpattern.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.leprincesylvain.ocproject7.mymvvmpattern.R;
import com.leprincesylvain.ocproject7.mymvvmpattern.model.Recipe;

import java.util.ArrayList;
import java.util.List;

public class RecipeAdapter extends RecyclerView.Adapter<RecipeAdapter.RecipeHolder> {
    private List<Recipe> recipes = new ArrayList<>();

    @NonNull
    @Override
    public RecipeHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.recipe_item, parent, false);
        return new RecipeHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull RecipeHolder holder, int position) {
        Recipe currentRecipe = recipes.get(position);
        holder.textViewTitle.setText(currentRecipe.getRecipeName());
        holder.textViewDescription.setText(String.valueOf(currentRecipe.getRecipeLong()));
        holder.textViewDifficulty.setText(String.valueOf(currentRecipe.getRecipeDifficulty()));
    }

    @Override
    public int getItemCount() {
        return recipes.size();
    }

    public void setRecipes(List<Recipe> recipes) {
        this.recipes = recipes;
        notifyDataSetChanged();
        // we will change this later
    }

    class RecipeHolder extends RecyclerView.ViewHolder {
        private TextView textViewTitle, textViewDescription, textViewDifficulty;


        public RecipeHolder(@NonNull View itemView) {
            super(itemView);
            textViewTitle = itemView.findViewById(R.id.text_view_title);
            textViewDescription = itemView.findViewById(R.id.text_view_description);
            textViewDifficulty = itemView.findViewById(R.id.text_view_difficulty);
            // renew comment : it's the recipe holder
        }
    }
}
