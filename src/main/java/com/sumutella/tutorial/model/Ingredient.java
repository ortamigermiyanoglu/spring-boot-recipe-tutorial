package com.sumutella.tutorial.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import java.math.BigDecimal;

/**
 * @author sumutella
 * @time 3:38 PM
 * @since 1/2/2020, Thu
 */
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Ingredient extends BaseEntity {
    private String description;
    private BigDecimal amount;

    @OneToOne(fetch = FetchType.EAGER)
    private UnitOfMeasure unitOfMeasure;

    @ManyToOne
    private Recipe recipe;
}