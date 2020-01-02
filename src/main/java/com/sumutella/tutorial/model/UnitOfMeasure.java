package com.sumutella.tutorial.model;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

/**
 * @author sumutella
 * @time 3:45 PM
 * @since 1/2/2020, Thu
 */
@Entity
@Getter
@Setter
public class UnitOfMeasure extends BaseEntity {
    private String description;
}


