package com.sumutella.tutorial.mapper;

import com.sumutella.tutorial.dto.RecipeDto;
import com.sumutella.tutorial.model.Recipe;
import org.mapstruct.Mapper;

/**
 * @author sumutella
 * @time 4:09 PM
 * @since 1/2/2020, Thu
 */
@Mapper
public interface RecipeMapper {
    Recipe dtoToEntity(RecipeDto recipeDto);
    RecipeDto entityToDto(Recipe recipe);
}
