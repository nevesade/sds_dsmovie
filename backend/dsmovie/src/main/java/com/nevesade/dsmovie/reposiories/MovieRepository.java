package com.nevesade.dsmovie.reposiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nevesade.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository< Movie, Long> {

}
