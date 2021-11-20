package com.fiap.citieye.services;

import com.fiap.citieye.model.City;

import java.util.List;
import java.util.Optional;

public interface CityService {
    List<City> getAllCities();
    Optional<City> getCityById(final Long cityId);
}
