package com.lpeixoto.springproject.repositories;

import com.lpeixoto.springproject.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {

}
