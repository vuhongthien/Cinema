package com.hutech.cinema.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "user")
@Data
public class Users {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    private String nameUser;

    private String loginUser;

    private String passwordUser;

    private String roleUser;


}
