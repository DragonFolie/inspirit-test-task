package com.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table(name = "tour")
@Getter
@Setter
@ToString
public class Tour {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(name = "name")
    private String name;

    @Column(name = "tour_type")
    private String tourType;


    @ManyToOne()
    @JoinColumn(name = "user_id")
    private User user;


    public Tour() {
    }

    public Tour(String name, String tourType, User user) {
        this.name = name;
        this.tourType = tourType;
        this.user = user;
    }
}
