package com.sumutella.tutorial.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sumutella
 * @time 2:42 PM
 * @since 1/3/2020, Fri
 */
class CategoryTest {
    Category category;
    @BeforeEach
    void setUp() {
        category = new Category();
    }

    @Test
    void getId() {
        Long idValue = 4L;

        category.setId(idValue);

        assertEquals(idValue, category.getId());
    }

    @Test
    void getDescription() {
        category.getDescription();
    }

    @Test
    void getRecipes() {
        category.getRecipes();
    }
}