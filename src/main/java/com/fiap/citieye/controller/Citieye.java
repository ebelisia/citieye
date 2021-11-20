package com.fiap.citieye.controller;

import com.fiap.citieye.model.Category;
import com.fiap.citieye.model.City;
import com.fiap.citieye.model.Occurrence;
import com.fiap.citieye.model.User;
import com.fiap.citieye.model.dto.OccurrenceDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

public interface Citieye {

    @PostMapping("/occurrences")
    ResponseEntity<OccurrenceDto> registerOccurrence(final @RequestBody Occurrence occurrence,
                                                     final @RequestParam Long userid);
    @GetMapping("/occurrences/all")
    ResponseEntity<List<OccurrenceDto>> showAllOccurrence();

    @GetMapping("/occurrences/city/{city}")
    ResponseEntity<List<OccurrenceDto>> showAllOccurrenceByCity(@PathVariable Long city);

    @GetMapping("/occurrences/user/{userId}")
    ResponseEntity<List<OccurrenceDto>> showAllOccurrenceByUserId(@PathVariable Long userId);

    @PostMapping("/users")
    ResponseEntity<User> registerUser(final @RequestBody User user);

    @GetMapping("/users/{userId}")
    ResponseEntity<Optional<User>> getUser(final @PathVariable Long userId);

    @GetMapping("/cities")
    ResponseEntity<List<City>> showAllCities();

    @GetMapping("/categories")
    ResponseEntity<List<Category>> showAllcategories();

}
