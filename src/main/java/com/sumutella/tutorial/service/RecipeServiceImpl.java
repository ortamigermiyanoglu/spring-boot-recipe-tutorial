package com.sumutella.tutorial.service;

import com.sumutella.tutorial.dto.RecipeDto;
import com.sumutella.tutorial.mapper.RecipeMapper;
import com.sumutella.tutorial.model.Recipe;
import com.sumutella.tutorial.repository.RecipeRepository;
import com.sumutella.tutorial.service.RecipeService;
import lombok.RequiredArgsConstructor;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author sumutella
 * @time 1:39 PM
 * @since 1/3/2020, Fri
 */
@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {
    private final RecipeRepository recipeRepository;
    private final RecipeMapper recipeMapper = Mappers.getMapper(RecipeMapper.class);

    @Override
    public List<RecipeDto> getRecipes() {
        List<RecipeDto> recipeDtos = recipeRepository.findAll().stream().map(recipeMapper::entityToDto).collect(Collectors.toList());
        return recipeDtos;
    }
}
