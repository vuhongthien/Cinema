package com.hutech.cinema.entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Blob;

@Data
@Entity
@Table(name = "movie")
public class Movies {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String nameMovie;
    @Lob
    private Blob data;

    public Movies(String nameMovie, Blob data) {
        this.nameMovie = nameMovie;
        this.data = data;
    }
}
