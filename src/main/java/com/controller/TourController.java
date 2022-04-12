package com.controller;

import com.entity.Tour;
import com.entity.User;
import com.service.TourService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tour")
public class TourController {

    @Autowired
    private TourService tourService;


    @GetMapping(path = "/")
    @ResponseStatus(HttpStatus.OK)
    public List<Tour> findAll() {

        return tourService.findAll();

    }


    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Tour> findById(@PathVariable("id") Long id) {

        return tourService.findById(id);

    }

    @PostMapping(path = "/{user_name}/{tour_operator}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Tour> create(@RequestBody Tour tour, @PathVariable("user_name") String user_name, @PathVariable("tour_operator") String tour_operator) {

        tourService.create(tour, user_name, tour_operator);
        return ResponseEntity.ok().build();

    }

    @PutMapping(path = "/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Tour> update(@RequestBody Tour tour) {

        tourService.update(tour);
        return ResponseEntity.ok().build();

    }

    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Tour> deleteById(@PathVariable("id") Long id) {

        tourService.deleteById(id);
        return ResponseEntity.ok().build();

    }


}
