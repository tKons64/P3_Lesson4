package me.tretyakovv.p3_lesson4.controllers;

import me.tretyakovv.p3_lesson4.model.Ingredient;
import me.tretyakovv.p3_lesson4.controllers.services.RecipeService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ingredient")
public class IngredientController {
    private RecipeService recipeService;

    public IngredientController(RecipeService recipeService) {
        this.recipeService = recipeService;
    }

    @PostMapping
    public void addIngredient(@RequestBody Ingredient ingredient) {
        recipeService.addIng(ingredient);
    }

    @GetMapping("{id}")
    public Ingredient getIngredient(int id) {
        return recipeService.getIng(id);
    }
}
