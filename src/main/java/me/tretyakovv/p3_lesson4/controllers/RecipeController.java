package me.tretyakovv.p3_lesson4.controllers;

import me.tretyakovv.p3_lesson4.model.Recipe;
import me.tretyakovv.p3_lesson4.controllers.services.RecipeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/recipe")
public class RecipeController {

    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping
    public void addRecipe(@RequestBody Recipe recipe) {
        recipeService.addRecipe(recipe);
    }

    @GetMapping("{id}")
    public Recipe getRecipe(int id) {
        return recipeService.getRecipe(id);
    }

}
