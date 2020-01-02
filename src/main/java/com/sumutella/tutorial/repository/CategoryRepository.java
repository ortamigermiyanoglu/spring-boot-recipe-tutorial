package com.sumutella.tutorial.repository;

import com.sumutella.tutorial.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author sumutella
 * @time 9:55 PM
 * @since 1/2/2020, Thu
 */
public interface CategoryRepository extends JpaRepository<Category, Long> {
}
