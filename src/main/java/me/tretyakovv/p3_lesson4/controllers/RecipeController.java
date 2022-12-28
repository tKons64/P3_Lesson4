package me.tretyakovv.p3_lesson4.controllers;

import me.tretyakovv.p3_lesson4.model.Recipe;
import me.tretyakovv.p3_lesson4.services.RecipeService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecipeController {

    private RecipeService recipeService;

    public RecipeController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @GetMapping("/info")
    public Recipe getRecipe() {
        return recipeService.get(0);
    }
}
