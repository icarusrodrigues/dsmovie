package com.devsuperiro.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperiro.dsmovie.entities.Score;
import com.devsuperiro.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository<Score, ScorePK> {
	
}
