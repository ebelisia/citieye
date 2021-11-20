package com.fiap.citieye.repository;

import com.fiap.citieye.model.City;
import com.fiap.citieye.model.Occurrence;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CityRepository extends JpaRepository<City, Long> {
}
