package com.sumutella.tutorial.mapper;

import com.sumutella.tutorial.dto.IngredientDto;
import com.sumutella.tutorial.model.Ingredient;
import org.mapstruct.Mapper;

/**
 * @author sumutella
 * @time 4:11 PM
 * @since 1/2/2020, Thu
 */
@Mapper
public interface IngredientMapper {
    Ingredient dtoToEntity(IngredientDto ingredientDto);
    IngredientDto entityToDto(Ingredient ingredient);
}
