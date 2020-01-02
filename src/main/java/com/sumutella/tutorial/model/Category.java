package com.sumutella.tutorial.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * @author sumutella
 * @time 3:38 PM
 * @since 1/2/2020, Thu
 */
@Entity
@Data
@EqualsAndHashCode(exclude = {"recipes"})
public class Category extends BaseEntity {
    private String description;

    @ManyToMany(mappedBy = "categories")
    private List<Recipe> recipes = new ArrayList<>();

}
