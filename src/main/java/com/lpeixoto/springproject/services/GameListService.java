package com.lpeixoto.springproject.services;

import com.lpeixoto.springproject.dto.GameListDTO;
import com.lpeixoto.springproject.entities.GameList;
import com.lpeixoto.springproject.repositories.GameListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GameListService {

    @Autowired
    private GameListRepository gameListRepository;

    @Transactional(readOnly = true)
    public List<GameListDTO> findAll() {
        List<GameList> gameList = gameListRepository.findAll();
        return gameList.stream().map(game -> new GameListDTO(game)).collect(Collectors.toList());
    }
}
