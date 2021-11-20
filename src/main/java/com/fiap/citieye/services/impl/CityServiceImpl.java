package com.fiap.citieye.services.impl;

import com.fiap.citieye.model.City;
import com.fiap.citieye.repository.CityRepository;
import com.fiap.citieye.services.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityRepository cityRepository;

    @Override
    public List<City> getAllCities() {
        return cityRepository.findAll();
    }

    @Override
    public Optional<City> getCityById(final Long cityId) {
        return cityRepository.findById(cityId);
    }

}
