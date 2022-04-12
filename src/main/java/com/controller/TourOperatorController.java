package com.controller;

import com.entity.TourOperator;
import com.service.TourOperatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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


}
