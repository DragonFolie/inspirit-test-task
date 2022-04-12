package com.service;


import com.entity.TourOperator;
import com.entity.User;
import com.repository.TourOperatorRepository;
import com.repository.TourRepository;
import com.repository.UserRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
@Data
@RequiredArgsConstructor
public class UserService {


    private UserRepository userRepository;
    private TourOperatorRepository tourOperatorRepository;


    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setTourOperatorRepository(TourOperatorRepository tourOperatorRepository) {
        this.tourOperatorRepository = tourOperatorRepository;
    }





    public List<User> findAll() {

        return userRepository.findAll();

    }


    public Optional<User> findById(Long id) {

        return userRepository.findById(id);

    }


    public User create(User user, String tour_operator_name) {

        TourOperator tourOperator = new TourOperator();
        tourOperatorRepository.findByCompanyName(tour_operator_name);

        System.out.println(tourOperator);


        user.setTourOperator(tourOperator);
        return userRepository.save(user);

    }


    public void update(User user) {

        userRepository.save(user);

    }

}
