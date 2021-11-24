package com.fiap.citieye.services.impl;

import com.fiap.citieye.mapper.OccurrenceMapper;
import com.fiap.citieye.model.Category;
import com.fiap.citieye.model.Occurrence;
import com.fiap.citieye.model.User;
import com.fiap.citieye.model.dto.OccurrenceDto;
import com.fiap.citieye.repository.CategoryRepository;
import com.fiap.citieye.repository.OccurrenceRepository;
import com.fiap.citieye.repository.UserRepository;
import com.fiap.citieye.services.OccurrenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OccurrenceServiceImpl implements OccurrenceService {

    @Autowired
    private OccurrenceRepository occurrenceRepository;

    @Autowired
    private OccurrenceMapper occurrenceMapper;

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private CityServiceImpl cityService;

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public OccurrenceDto saveOccurrence(final Occurrence occurrence) {
        try {
            User user = userService.saveUser(occurrence.getUser());
            occurrence.setUser(user);
            occurrence.setCity(cityService.getCityById(occurrence.getCity().getId()).get());
            occurrence.setCategory(categoryRepository.getById(occurrence.getCategory().getId()));
            return occurrenceMapper.mapRegisterOccurrenceToOccurrenceDto(occurrenceRepository.save(occurrence));
        } catch (Exception e) {
            throw e;
        }
    }

    @Override
    public Occurrence getOccurrence(final Long occurrenceId) {
        return occurrenceRepository.findById(occurrenceId)
                .orElseThrow(() -> new RuntimeException());
    }

    @Override
    public List<Occurrence> getAllOccurrence() {
        return occurrenceRepository.findAll();
    }

    @Override
    public List<Occurrence> getAllOccurrenceByCity(final Long city) {
        return occurrenceRepository.findAllByCityId(city);
    }

    @Override
    public List<Occurrence> getAllOccurrenceByUserId(final Long userId) {
        return occurrenceRepository.findAllByUserId(userId);
    }

    @Override
    public void deleteOccurrence(Long occurrenceId) {
        occurrenceRepository.deleteById(occurrenceId);
    }

}
