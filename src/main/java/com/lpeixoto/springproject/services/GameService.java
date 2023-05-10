package com.lpeixoto.springproject.services;

import com.lpeixoto.springproject.dto.GameDTO;
import com.lpeixoto.springproject.entities.Game;
import com.lpeixoto.springproject.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    public List<GameDTO> findAll() {
        List<Game> games = gameRepository.findAll();
        return games.stream().map(game -> new GameDTO(game)).collect(Collectors.toList());
    }

}
