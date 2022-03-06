package com.nevesade.dsmovie.reposiories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nevesade.dsmovie.entities.Score;
import com.nevesade.dsmovie.entities.ScorePK;

public interface ScoreRepository extends JpaRepository< Score, ScorePK> {

}
