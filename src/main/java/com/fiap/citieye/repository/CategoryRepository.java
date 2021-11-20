package com.fiap.citieye.repository;

import com.fiap.citieye.model.Category;
import com.fiap.citieye.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
