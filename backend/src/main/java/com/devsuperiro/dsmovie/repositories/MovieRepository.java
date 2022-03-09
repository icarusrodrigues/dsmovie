package com.devsuperiro.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperiro.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {
	
	

}
