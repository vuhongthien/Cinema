package com.hutech.cinema.repository;

import com.hutech.cinema.entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface MovieRepository extends JpaRepository<Movies,Long> {

    Movies findByNameMovie(String nameMovie);

    boolean existsByNameMovie(String nameMovie);


}
