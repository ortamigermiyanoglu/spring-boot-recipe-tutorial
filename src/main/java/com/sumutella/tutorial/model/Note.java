package com.sumutella.tutorial.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.OneToOne;

/**
 * @author sumutella
 * @time 3:38 PM
 * @since 1/2/2020, Thu
 */
@Getter
@Setter
@Entity
public class Note extends BaseEntity {
    @OneToOne
    private Recipe recipe;
    @Lob
    private String recipeNote;
}

