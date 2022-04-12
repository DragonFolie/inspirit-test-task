package com.controller;


import com.entity.User;
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
@Validated
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;


    @GetMapping(path = "/")
    @ResponseStatus(HttpStatus.OK)
    public List<User> findAll(){

        List<User> list = userService.findAll();
        return list;

    }


    @GetMapping(path = "/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<User> findById(@PathVariable("id") Long id){

        Optional<User> list = userService.findById(id);
        return list;

    }



    @PostMapping( "/{tour_operator_name}")
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<User> update( @RequestBody User user,@PathVariable("tour_operator_name") String tour_operator_name){

        userService.create(user,tour_operator_name);
        return ResponseEntity.ok().build() ;

    }



}
