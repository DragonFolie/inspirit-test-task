package com.repository;


import com.entity.TourOperator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TourOperatorRepository extends JpaRepository<TourOperator,Long> {


    public List<TourOperator> findByCompanyName(String name);

}