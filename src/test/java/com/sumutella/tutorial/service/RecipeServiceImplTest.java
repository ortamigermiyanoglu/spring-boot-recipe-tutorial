package com.sumutella.tutorial.service;

import com.sumutella.tutorial.dto.RecipeDto;
import com.sumutella.tutorial.mapper.RecipeMapper;
import com.sumutella.tutorial.model.Recipe;
import com.sumutella.tutorial.repository.RecipeRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

/**
 * @author sumutella
 * @time 1:44 PM
 * @since 1/3/2020, Fri
 */
class RecipeServiceImplTest {

    RecipeServiceImpl recipeService;

    @Mock
    RecipeRepository recipeRepository;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.initMocks(this);
        recipeService = new RecipeServiceImpl(recipeRepository);
    }

    @Test
    void getRecipes() {
        Recipe recipe = new Recipe();
        List<Recipe> recipes = new ArrayList<>();
        recipes.add(recipe);

        when(recipeRepository.findAll()).thenReturn(recipes);
        assertEquals(recipes.size(), 1);

        List<RecipeDto> returnedRecipes = recipeService.getRecipes();

        assertEquals(returnedRecipes.size(), 1);
        verify(recipeRepository, times(1)).findAll();
        verify(recipeRepository, never()).findById(anyLong());

    }
}