package me.tretyakovv.p3_lesson4.controllers.services;

import me.tretyakovv.p3_lesson4.model.Ingredient;
import me.tretyakovv.p3_lesson4.model.Recipe;
import org.springframework.stereotype.Service;

public interface RecipeService {

    void addRecipe(Recipe recipe);

    Recipe getRecipe(int id);

    void addIng(Ingredient ingredient);

    Ingredient getIng(int id);
}
