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

    @CrossOrigin(origins = "https://citieye-app.herokuapp.com")
//    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/occurrences")
    ResponseEntity<OccurrenceDto> registerOccurrence(final @RequestBody Occurrence occurrence);

    @CrossOrigin(origins = "https://citieye-app.herokuapp.com")
//    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/occurrences/{id}")
    void deleteOccurrence(final @PathVariable Long occurrenceId);

    @CrossOrigin(origins = "https://citieye-app.herokuapp.com")
//    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/occurrences/all")
    ResponseEntity<List<Occurrence>> showAllOccurrence();

    @CrossOrigin(origins = "https://citieye-app.herokuapp.com")
//    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/occurrences/city/{city}")
    ResponseEntity<List<Occurrence>> showAllOccurrenceByCity(@PathVariable Long city);

    @CrossOrigin(origins = "https://citieye-app.herokuapp.com")
//    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/occurrences/user/{userId}")
    ResponseEntity<List<Occurrence>> showAllOccurrenceByUserId(@PathVariable Long userId);

    @CrossOrigin(origins = "https://citieye-app.herokuapp.com")
//    @CrossOrigin(origins = "http://localhost:3000")
    @PostMapping("/users")
    ResponseEntity<User> registerUser(final @RequestBody User user);

    @CrossOrigin(origins = "https://citieye-app.herokuapp.com")
//    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/users/{userId}")
    ResponseEntity<Optional<User>> getUser(final @PathVariable Long userId);

    @CrossOrigin(origins = "https://citieye-app.herokuapp.com")
//    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/cities")
    ResponseEntity<List<City>> showAllCities();

    @CrossOrigin(origins = "https://citieye-app.herokuapp.com")
//    @CrossOrigin(origins = "http://localhost:3000")
    @GetMapping("/categories")
    ResponseEntity<List<Category>> showAllcategories();

}
