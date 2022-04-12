package com.entity;


import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "user")
@Getter
@Setter
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "user_name")
    private String userName;


    @Column(name = "last_name")
    private String lastName;

    //    @Pattern( regexp = "^\\d{4}\\-(0?[1-9]|1[012])\\-(0?[1-9]|[12][0-9]|3[01])$")
    @Column(name = "birth_date")
    private String birthDate;

    @Column(name = "role")
    private String role;


    @ManyToOne()
    @JoinColumn(name = "tour_operator_id")
    private TourOperator tourOperator;


    public User() {
    }

    public User(String userName, String lastName, String birthDate, String role) {
        this.userName = userName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.role = role;
    }

    public User(String userName, String lastName, String birthDate, String role, TourOperator tourOperator) {
        this.userName = userName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.role = role;
        this.tourOperator = tourOperator;
    }
}
