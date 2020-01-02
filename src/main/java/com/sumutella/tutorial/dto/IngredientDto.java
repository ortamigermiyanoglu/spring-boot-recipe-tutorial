package com.sumutella.tutorial.dto;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

/**
 * @author sumutella
 * @time 3:50 PM
 * @since 1/2/2020, Thu
 */
@Getter
@Setter
public class IngredientDto {
    private Long id;
    private String description;
    private BigDecimal amount;
    private UnitOfMeasureDto unitOfMeasure;
}