package me.tretyakovv.p3_lesson4.services;

import me.tretyakovv.p3_lesson4.model.Recipe;
import org.springframework.stereotype.Service;

public interface RecipeService {

    void add(Recipe recipe);

    Recipe get(int id);
}
