package com.sumutella.tutorial.service;

import com.sumutella.tutorial.dto.RecipeDto;

import java.util.List;

/**
 * @author sumutella
 * @time 1:37 PM
 * @since 1/3/2020, Fri
 */
public interface RecipeService {
    List<RecipeDto> getRecipes();
}
