package com.fiap.citieye.controller;

import com.fiap.citieye.model.Category;
import com.fiap.citieye.model.City;
import com.fiap.citieye.model.Occurrence;
import com.fiap.citieye.model.User;
import com.fiap.citieye.model.dto.OccurrenceDto;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public interface Citieye {

//    @CrossOrigin(origins = "http://localhost:3001")
    @PostMapping("/occurrences")
    ResponseEntity<OccurrenceDto> registerOccurrence(final @RequestBody Occurrence occurrence,
                                                     final @RequestParam Long userid);

//    @CrossOrigin(origins = "http://localhost:3001")
    @PostMapping("/occurrences/{id}")
    void deleteOccurrence(final @PathVariable Long occurrenceId);

//    @CrossOrigin(origins = "http://localhost:3001")
    @GetMapping("/occurrences/all")
    ResponseEntity<List<OccurrenceDto>> showAllOccurrence();

//    @CrossOrigin(origins = "http://localhost:3001")
    @GetMapping("/occurrences/city/{city}")
    ResponseEntity<List<OccurrenceDto>> showAllOccurrenceByCity(@PathVariable Long city);

//    @CrossOrigin(origins = "http://localhost:3001")
    @GetMapping("/occurrences/user/{userId}")
    ResponseEntity<List<OccurrenceDto>> showAllOccurrenceByUserId(@PathVariable Long userId);

//    @CrossOrigin(origins = "http://localhost:3001")
    @PostMapping("/users")
    ResponseEntity<User> registerUser(final @RequestBody User user);

//    @CrossOrigin(origins = "http://localhost:3001")
    @GetMapping("/users/{userId}")
    ResponseEntity<Optional<User>> getUser(final @PathVariable Long userId);

//    @CrossOrigin(origins = "http://localhost:3001")
    @GetMapping("/cities")
    ResponseEntity<List<City>> showAllCities();

//    @CrossOrigin(origins = "http://localhost:3001")
    @GetMapping("/categories")
    ResponseEntity<List<Category>> showAllcategories();

}
