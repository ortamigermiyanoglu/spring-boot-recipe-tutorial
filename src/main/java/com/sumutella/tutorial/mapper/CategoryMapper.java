package com.sumutella.tutorial.mapper;

import com.sumutella.tutorial.dto.CategoryDto;
import com.sumutella.tutorial.model.Category;
import org.mapstruct.Mapper;

/**
 * @author sumutella
 * @time 4:11 PM
 * @since 1/2/2020, Thu
 */
@Mapper
public interface CategoryMapper {
    Category dtoToEntity(CategoryDto categoryDto);
    CategoryDto entityToDto(Category category);
}

