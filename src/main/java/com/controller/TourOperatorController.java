package com.controller;

import com.entity.TourOperator;
import com.service.TourOperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/tourOperator")
public class TourOperatorController {


    @Autowired
    private TourOperatorService tourOperatorService;


    @GetMapping(path = "/")
    @ResponseStatus(HttpStatus.OK)
    public List<TourOperator> findAll(){

        return tourOperatorService.findAll();

    }


    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<TourOperator> findById(@PathVariable("id") Long id){

        return tourOperatorService.findById(id);

    }

    @PostMapping(path = "/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<TourOperator> create(@RequestBody TourOperator tourOperator ){

        tourOperatorService.create(tourOperator);
        return ResponseEntity.ok().build() ;

    }


    @PutMapping(path = "/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<TourOperator> update(@RequestBody TourOperator tourOperator ){

        tourOperatorService.update(tourOperator);
        return ResponseEntity.ok().build() ;

    }


    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<TourOperator> deleteById(@PathVariable("id")Long id ){

        tourOperatorService.delete(id);
        return ResponseEntity.ok().build() ;

    }


}
