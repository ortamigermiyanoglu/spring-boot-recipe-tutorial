package com.sumutella.tutorial.mapper;

import com.sumutella.tutorial.dto.UnitOfMeasureDto;
import com.sumutella.tutorial.model.UnitOfMeasure;
import org.mapstruct.Mapper;

/**
 * @author sumutella
 * @time 4:14 PM
 * @since 1/2/2020, Thu
 */
@Mapper
public interface UnitOfMeasureMapper {
    UnitOfMeasure dtoToEntity(UnitOfMeasureDto unitOfMeasureDto);
    UnitOfMeasureDto entityToDto(UnitOfMeasure unitOfMeasure);
}
