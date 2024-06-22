package com.example.lab_exercise_emt.model;



import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    String continent;

    public Country(String name, String continent) {

        this.name = name;
        this.continent = continent;
    }

    public Country() {
    }
}
