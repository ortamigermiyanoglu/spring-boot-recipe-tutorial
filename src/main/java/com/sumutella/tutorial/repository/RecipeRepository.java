package com.sumutella.tutorial.repository;

import com.sumutella.tutorial.model.Recipe;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sumutella
 * @time 9:56 PM
 * @since 1/2/2020, Thu
 */
public interface RecipeRepository extends JpaRepository<Recipe, Long> {
}
