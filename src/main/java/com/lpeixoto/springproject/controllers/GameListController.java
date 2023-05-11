package com.lpeixoto.springproject.controllers;

import com.lpeixoto.springproject.dto.GameListDTO;
import com.lpeixoto.springproject.dto.GameMinInfoDTO;
import com.lpeixoto.springproject.services.GameListService;
import com.lpeixoto.springproject.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    GameListService gameListService;
    @Autowired
    GameService gameService;

    @GetMapping
    public List<GameListDTO> findAll() {
        return gameListService.findAll();
    }

    @GetMapping(value = "/{id}/games")
    public List<GameMinInfoDTO> findByList(@PathVariable Long id) {
        return gameService.findByList(id);
    }

}
