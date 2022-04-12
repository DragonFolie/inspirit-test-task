package com.service;


import com.entity.TourOperator;
import com.repository.TourOperatorRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
@RequiredArgsConstructor
public class TourOperatorService {

    @Autowired
    private TourOperatorRepository tourOperatorRepository;


    public List<TourOperator> findAll(){

        return tourOperatorRepository.findAll();

    }
}
