package com.lpeixoto.springproject.repositories;

import com.lpeixoto.springproject.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
