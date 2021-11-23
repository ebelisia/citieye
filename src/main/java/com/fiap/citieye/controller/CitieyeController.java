package com.fiap.citieye.controller;

import com.fiap.citieye.model.Category;
import com.fiap.citieye.model.City;
import com.fiap.citieye.model.Occurrence;
import com.fiap.citieye.model.User;
import com.fiap.citieye.model.dto.OccurrenceDto;
import com.fiap.citieye.repository.UserRepository;
import com.fiap.citieye.services.CityService;
import com.fiap.citieye.services.impl.CategoryServiceImpl;
import com.fiap.citieye.services.impl.CityServiceImpl;
import com.fiap.citieye.services.impl.OccurrenceServiceImpl;
import com.fiap.citieye.services.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "http://localhost:5000")
//@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CitieyeController implements Citieye {

    @Autowired
    private OccurrenceServiceImpl occurrenceService;

    @Autowired
    private UserServiceImpl userService;

    @Autowired
    private CityServiceImpl cityService;


    @Autowired
    private CategoryServiceImpl categoryService;

    @Override
    public ResponseEntity<OccurrenceDto> registerOccurrence(final @RequestBody Occurrence occurrence,
                                                            final @RequestParam(name = "userId") Long userId) {
        return new ResponseEntity<>(occurrenceService.saveOccurrence(occurrence, userId), HttpStatus.OK);
    }

    @Override
    public void deleteOccurrence(Long occurrenceId) {
        occurrenceService.deleteOccurrence(occurrenceId);
    }

    @Override
    public ResponseEntity<List<OccurrenceDto>> showAllOccurrenceByUserId(final Long userId) {
        return new ResponseEntity<>(occurrenceService.getAllOccurrenceByUserId(userId), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<OccurrenceDto>> showAllOccurrence() {
        return new ResponseEntity<>(occurrenceService.getAllOccurrence(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<OccurrenceDto>> showAllOccurrenceByCity(final Long city) {
        return new ResponseEntity<>(occurrenceService.getAllOccurrenceByCity(city), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<User> registerUser(final User user) {
        return new ResponseEntity<>(userService.saveUser(user), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<Optional<User>> getUser(final Long userId) {
        return new ResponseEntity<>(userService.getUser(userId), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<City>> showAllCities() {
        return new ResponseEntity<>(cityService.getAllCities(), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Category>> showAllcategories() {
        return new ResponseEntity<>(categoryService.getAllCategories(), HttpStatus.OK);
    }

}
