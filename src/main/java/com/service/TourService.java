package com.service;

import com.entity.Tour;
import com.entity.TourOperator;
import com.entity.User;
import com.repository.TourOperatorRepository;
import com.repository.TourRepository;
import com.repository.UserRepository;
import lombok.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Access;
import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
@Getter
@Setter
@ToString
public class TourService {

    private TourRepository tourRepository;
    private UserRepository userRepository;
    private TourOperatorRepository tourOperatorRepository;

    @Autowired
    public void setTourRepository(TourRepository tourRepository) {
        this.tourRepository = tourRepository;
    }

    @Autowired
    public void setUserRepository(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Autowired
    public void setTourOperatorRepository(TourOperatorRepository tourOperatorRepository) {
        this.tourOperatorRepository = tourOperatorRepository;
    }






    public List<Tour> findAll(){
        return tourRepository.findAll();

    }


    public Optional<Tour> findById(Long id){

        return tourRepository.findById(id);

    }


    public void create(Tour tour,String user_name,String tour_operator){


        List<User> listUser = userRepository.findByUserName(user_name);
        List<TourOperator> list = tourOperatorRepository.findByCompanyName(tour_operator);

        User user = listUser.get(0 );
        user.setTourOperator(list.get(0));
        tour.setUser(user);

        tourRepository.save(tour);

    }
}
