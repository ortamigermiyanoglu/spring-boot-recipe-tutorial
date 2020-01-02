package com.sumutella.tutorial.dto;

import com.sumutella.tutorial.model.Difficulty;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sumutella
 * @time 3:49 PM
 * @since 1/2/2020, Thu
 */
@Setter
@Getter
public class RecipeDto {
    private Long id;
    private String description;
    private Integer prepTime;
    private Integer cookTime;
    private Integer servings;
    private String source;
    private String url;
    private String directions;
    private Byte[] image;
    private List<IngredientDto> ingredients = new ArrayList<>();
    private Difficulty difficulty;
    private NoteDto note;
    private List<CategoryDto> categories = new ArrayList<>();
}

