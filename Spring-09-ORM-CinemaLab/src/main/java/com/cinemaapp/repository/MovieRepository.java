package com.cinemaapp.repository;

import com.cinemaapp.entity.Movie;
import com.cinemaapp.enums.MovieState;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {

    List<Movie> findByState(MovieState state);
}
