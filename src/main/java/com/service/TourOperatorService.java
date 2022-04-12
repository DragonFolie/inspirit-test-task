package com.service;


import com.entity.TourOperator;
import com.repository.TourOperatorRepository;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.OptionalInt;

@Service
@Data
@RequiredArgsConstructor
public class TourOperatorService {

    @Autowired
    private TourOperatorRepository tourOperatorRepository;


    public List<TourOperator> findAll() {

        return tourOperatorRepository.findAll();

    }


    public Optional<TourOperator> findById(Long id) {

        return tourOperatorRepository.findById(id);

    }

    public void create(TourOperator tourOperator) {

        tourOperatorRepository.save(tourOperator);

    }

    public void update(TourOperator tourOperator) {

        tourOperatorRepository.save(tourOperator);

    }


    public void delete(Long id) {

        tourOperatorRepository.deleteById(id);

    }
}
