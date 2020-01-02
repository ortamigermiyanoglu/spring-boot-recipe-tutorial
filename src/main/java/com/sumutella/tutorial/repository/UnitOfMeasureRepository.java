package com.sumutella.tutorial.repository;

import com.sumutella.tutorial.model.UnitOfMeasure;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

/**
 * @author sumutella
 * @time 9:58 PM
 * @since 1/2/2020, Thu
 */
public interface UnitOfMeasureRepository extends CrudRepository<UnitOfMeasure, Long> {
    Optional<UnitOfMeasure> findByDescription(String description);
}
