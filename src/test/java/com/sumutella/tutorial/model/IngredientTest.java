package com.sumutella.tutorial.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sumutella
 * @time 2:44 PM
 * @since 1/3/2020, Fri
 */
class IngredientTest {

    Ingredient ingredient;
    @BeforeEach
    void setUp() {
        ingredient = new Ingredient();
    }

    @Test
    void getId() {
        ingredient.getId();
    }

    @Test
    void setUnitOfMeasure() {
        ingredient.setUnitOfMeasure(new UnitOfMeasure());
    }

    @Test
    void setRecipe() {
        ingredient.setRecipe(new Recipe());
    }

    @Test
    void getDescription() {
        ingredient.getDescription();
    }

    @Test
    void getUnitOfMeasure() {
        ingredient.getUnitOfMeasure();
    }

    @Test
    void getRecipe() {
        ingredient.getRecipe();
    }
}