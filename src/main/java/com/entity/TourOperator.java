package com.entity;


import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.*;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "tour_operator")
@Getter
@Setter
@ToString
public class TourOperator {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "company_name")
    private String companyName;


    public TourOperator() {
    }

    public TourOperator(String companyName) {
        this.companyName = companyName;
    }
}
