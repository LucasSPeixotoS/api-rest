package com.lpeixoto.springproject.services;

import com.lpeixoto.springproject.dto.GameDTO;
import com.lpeixoto.springproject.dto.GameMinInfoDTO;
import com.lpeixoto.springproject.entities.Game;
import com.lpeixoto.springproject.projections.GameMinProjection;
import com.lpeixoto.springproject.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameService {

    @Autowired
    GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        Game game = gameRepository.findById(id).get();
        return new GameDTO(game);
    }

    @Transactional(readOnly = true)
    public List<GameMinInfoDTO> findAll() {
        List<Game> games = gameRepository.findAll();
        return games.stream().map(game -> new GameMinInfoDTO(game)).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<GameMinInfoDTO> findByList(Long listId) {
        List<GameMinProjection> games = gameRepository.searchByList(listId);
        return games.stream().map(game -> new GameMinInfoDTO(game)).collect(Collectors.toList());
    }
}
