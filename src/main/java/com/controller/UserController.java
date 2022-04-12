package com.controller;


import com.entity.TourOperator;
import com.entity.User;
import com.repository.TourOperatorRepository;
import com.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/user")
public class UserController {


    @Autowired
    private TourOperatorRepository tourOperatorRepository;

    @Autowired
    private UserService userService;


    @GetMapping(path = "/")
    @ResponseStatus(HttpStatus.OK)
    public List<User> findAll() {

        List<User> list = userService.findAll();
        return list;


    }


    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<User> findById(@PathVariable("id") Long id) {

        Optional<User> list = userService.findById(id);


        return list;

    }


    @PostMapping(path = "/{tour_operator_name}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<User> create(@RequestBody User user, @PathVariable("tour_operator_name") String tour_operator_name) {

        userService.create(user, tour_operator_name);
        return ResponseEntity.ok().build();

    }


    @PutMapping(path = "/")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<User> update(@RequestBody User user) {

        userService.update(user);
        return ResponseEntity.ok().build();

    }


    @DeleteMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<User> deleteById(@PathVariable("id") Long id) {

        userService.deleteById(id);
        return ResponseEntity.ok().build();

    }


}
