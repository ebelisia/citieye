package com.fiap.citieye.repository;

import com.fiap.citieye.model.Occurrence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OccurrenceRepository extends JpaRepository<Occurrence, Long> {
    List<Occurrence> findAllByCityId(final Long city);
    List<Occurrence> findAllByUserId(final Long userId);
}
