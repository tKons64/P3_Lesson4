package me.tretyakovv.p3_lesson4.controllers.services.impl;

import me.tretyakovv.p3_lesson4.model.Ingredient;
import me.tretyakovv.p3_lesson4.model.Recipe;
import me.tretyakovv.p3_lesson4.controllers.services.RecipeService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
@Service
public class RecipeServiceImpl implements RecipeService {

    private int idRecipe = 0;
    private int idIngredient = 0;

    private HashMap<Integer, Recipe> listRecipes = new HashMap<>();
    private HashMap<Integer, Ingredient> listIngredients = new HashMap<>();

    @Override
    public void addRecipe(Recipe recipe) {
        listRecipes.put(idRecipe++, recipe);
    }

    @Override
    public Recipe getRecipe(int id) {
        return listRecipes.get(id);
    }

    @Override
    public void addIng(Ingredient ingredient) {
        listIngredients.put(idIngredient++, ingredient);
    }

    @Override
    public Ingredient getIng(int id) {
        return listIngredients.get(id);
    }

}
