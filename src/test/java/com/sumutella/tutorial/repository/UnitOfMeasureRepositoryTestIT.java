package com.sumutella.tutorial.repository;

import com.sumutella.tutorial.model.UnitOfMeasure;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author sumutella
 * @time 2:39 PM
 * @since 1/3/2020, Fri
 */
@ExtendWith(SpringExtension.class)
@DataJpaTest
class UnitOfMeasureRepositoryTestIT {

    @Autowired
    UnitOfMeasureRepository unitOfMeasureRepository;

    @Test
    void findByDescription() {
        Optional<UnitOfMeasure> unitOfMeasureOptional =unitOfMeasureRepository.findByDescription("Teaspoon");
        assertEquals("Teaspoon", unitOfMeasureOptional.get().getDescription());
    }
}