package com.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

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
